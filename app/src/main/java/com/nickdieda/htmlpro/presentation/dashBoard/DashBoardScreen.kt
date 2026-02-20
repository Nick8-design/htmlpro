package com.nickdieda.htmlpro.presentation.dashBoard

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.data.notes.JavaScriptNotes
import com.nickdieda.htmlpro.functions.CertificateGenerator
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.presentation.components.CertCard
import com.nickdieda.htmlpro.presentation.components.CertName
import com.nickdieda.htmlpro.presentation.components.TotalProgress
import com.nickdieda.htmlpro.presentation.components.FunCards
import com.nickdieda.htmlpro.presentation.components.TopicProgress
import com.nickdieda.htmlpro.presentation.components.textComponents.TwoTitles
import com.nickdieda.htmlpro.store.DataStoreManager
import kotlinx.coroutines.launch

@Composable
fun Dashboard(nav: NavController,viewModel: DashboardViewModel,dataStoreManager: DataStoreManager) {

    var showCertName by remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()

    val name by dataStoreManager.username.collectAsState(initial = "Developer")

    var fullname by  remember { mutableStateOf(name) }

    val lastId by dataStoreManager.lastSubtopicId.collectAsState(initial = null)


    val currentSubtopic = remember(lastId) { viewModel.getSubtopic(lastId) }
    val (onSubIndex, totalCount) = remember(lastId) { viewModel.getPosition(lastId) }
    val subProgress by dataStoreManager.getSubtopicProgress(lastId ?: -1).collectAsState(initial = 0f)



    val subtopicName = currentSubtopic?.subTopicName ?: "Start Learning"

    val completedTopicsCount by remember {
        dataStoreManager.getCompletedTopicsCount(JavaScriptNotes)
    }.collectAsState(initial = 0)

    val totalTopicsCount = remember { JavaScriptNotes.size }


    val allSubtopicIds = remember { JavaScriptNotes.flatMap { it.subtopics }.map { it.sutopicId } }
    val totalProgress by dataStoreManager.getTotalProgress(allSubtopicIds).collectAsState(initial = 0f)
     val context= LocalContext.current

    val isClaimed by dataStoreManager.isCertificateClaimed.collectAsState(initial = false)

    // AUTO-RESET LOGIC: If progress drops from 100, allow claiming again in the future
    LaunchedEffect(totalProgress) {
        if (totalProgress < 1f && isClaimed) {
            dataStoreManager.setCertificateClaimed(false)
        }
    }

    if(showCertName){
        CertName(
            onDismissRequest = { showCertName = false },
            fullName = fullname,
            onClear = { fullname = "" },
            onDone = {
                if (fullname.isNotEmpty()) {
                    when {
                        totalProgress < 1f -> {
                            val percent = (totalProgress * 100).toInt()
                            Toast.makeText(context, "Complete the course first! ($percent%)", Toast.LENGTH_SHORT).show()
                        }
                        isClaimed -> {
                            Toast.makeText(context, "Certificate already claimed!", Toast.LENGTH_SHORT).show()
                        }
                        else -> {
                            // SUCCESS: Generate and Mark as Claimed
                            CertificateGenerator.generateCertificate(context, fullname)
                            scope.launch {
                                dataStoreManager.setCertificateClaimed(true)
                            }
                        }
                    }
                } else {
                    Toast.makeText(context, "Please Enter Full Name", Toast.LENGTH_SHORT).show()
                }
                showCertName = false
                fullname = ""
            },
            onValueChange = { fullname = it }
        )
    }



    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(10.dp, 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item {
            Spacer(modifier = Modifier.height(32.dp))
        }
        item {

            TwoTitles(large = if(name=="User") "Welcome $name, edit name in extra" else "Welcome back, $name", small = if(name=="User") "Thank you for Downloading the app" else "Keep coding and learning!")

        }
        item {
            Spacer(modifier = Modifier.height(32.dp))
        }
        item {
            TopicProgress(

                subtopic=subtopicName,
                totalSubtopics=totalCount,
                onsubtopic= onSubIndex,
                progressPercent = subProgress,
                onContinue={
                    val idToOpen = lastId ?: 0
                    nav.navigate("${ScreenRoutes.NotesDetails.route}/$idToOpen")       }

            )
        }
        item {
            Spacer(modifier = Modifier.height(32.dp))
        }
        item{
            TotalProgress(
                onArrowClicked = { nav.navigate(ScreenRoutes.Notes.route) },
                completedTopics = completedTopicsCount,
                totalTopic = totalTopicsCount,
                dataStoreManager = dataStoreManager
            )
        }
        item {
            Spacer(modifier = Modifier.height(24.dp))
        }

        item {
            FunCards(
                onCompiler = {
                    nav.navigate(ScreenRoutes.Compiler.route)
                },
                onProjectClicked = {
                    nav.navigate(ScreenRoutes.Projects.route)
                },
                onSettings = {
                    nav.navigate(ScreenRoutes.Settings.route)
                },
                onSample = {
                    nav.navigate(ScreenRoutes.Samples.route)
                },
                modifier = Modifier.fillMaxWidth(0.90f)
            )
        }


        item {
            Spacer(modifier = Modifier.height(24.dp))

            CertCard(
                progress = totalProgress,
                onClaim = {
                    showCertName=true
                }
            )




        }

//        item { Spacer(modifier = Modifier.height(40.dp)) }
    }
}


