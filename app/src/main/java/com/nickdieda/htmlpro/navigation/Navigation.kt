package com.nickdieda.htmlpro.navigation



import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.hilt.navigation.compose.hiltViewModel

import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.nickdieda.htmlpro.presentation.RateAppDialog
import com.nickdieda.htmlpro.presentation.compiler.Compiler
import com.nickdieda.htmlpro.presentation.components.LuxuryBottomBar
import com.nickdieda.htmlpro.presentation.components.MyTopAppBar
import com.nickdieda.htmlpro.presentation.dashBoard.Dashboard
import com.nickdieda.htmlpro.presentation.notes.Notes
import com.nickdieda.htmlpro.presentation.notesDetails.NotesDetails
import com.nickdieda.htmlpro.presentation.projects.Projects
import com.nickdieda.htmlpro.presentation.settings.Settings

import com.nickdieda.htmlpro.presentation.about.AboutScreen
import com.nickdieda.htmlpro.presentation.aboutUs.AboutUs
import com.nickdieda.htmlpro.presentation.sample.Sampler
import com.nickdieda.htmlpro.presentation.dashBoard.DashboardViewModel
import com.nickdieda.htmlpro.presentation.notesDetails.handleSmartBack
import com.nickdieda.htmlpro.presentation.quiz.Quiz
import com.nickdieda.htmlpro.presentation.search.Search
import com.nickdieda.htmlpro.presentation.search.SearchViewModel
import io.github.rosemoe.sora.widget.CodeEditor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("SuspiciousIndentation")
@Composable
fun MyApp( mainViewModel: MainViewModel = hiltViewModel()) {


//    val context = LocalContext.current

    var openned_sub by rememberSaveable { mutableStateOf("") }
    var openedsubId by rememberSaveable { mutableStateOf(0) }

    val navController = rememberNavController()
    val editorRef = remember { mutableStateOf<CodeEditor?>(null) }

    val notesRepo = mainViewModel.notesRepository

//    val isComplete by mainViewModel.isOnboardingComplete.collectAsState(initial = true)

//    if (isComplete == null) return

    // Observe the current route
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route
//
    val title = when {
        currentRoute == ScreenRoutes.DashBoard.route -> ""
        currentRoute == ScreenRoutes.Notes.route -> "HTML Notes"
        currentRoute == ScreenRoutes.Projects.route -> "Projects"
        currentRoute == ScreenRoutes.Samples.route -> "Samples"
        // Now this works perfectly because it's a standalone Boolean check
        currentRoute?.contains(ScreenRoutes.NotesDetails.route) == true -> openned_sub
        currentRoute?.contains(ScreenRoutes.Quiz.route) == true -> openned_sub
        currentRoute?.contains(ScreenRoutes.Compiler.route) ==true -> "Compiler"
        else -> ""
    }


//    Log.i("subId","$openedsubId ==> $openned_sub" )


//
    val showTopBar = when (currentRoute) {
        ScreenRoutes.DashBoard.route -> false
//        ScreenRoutes.Projects.route -> false
        ScreenRoutes.Onboarding.route -> false
//        ScreenRoutes.Compiler.route -> false
        else -> true
    }

    val showBottomBar = when (currentRoute) {
        ScreenRoutes.DashBoard.route -> true
        ScreenRoutes.Notes.route -> true
        else -> false

    }


    val configuration = LocalConfiguration.current
    val largeScreen = configuration.screenHeightDp > configuration.screenWidthDp

    val  scope = rememberCoroutineScope()
    val hasRated by mainViewModel.dataStore.hasRatedApp.collectAsState(initial = true)
    var showDialog by remember { mutableStateOf(false) }
    var triggerTimer by remember { mutableStateOf(0) } // Used to restart the timer

//    LaunchedEffect(hasRated, triggerTimer) {
//        if (!hasRated) {
//            // Initial delay (1 minute = 60,000ms)
//            // Using 10 seconds for your testing? Change to 60000L for 1 min
//            delay(1000L)
//            showDialog = true
//        }
//    }



    if (showDialog) {
        RateAppDialog(
            onDismiss = {
                showDialog = false
                // If user clicks later, restart timer with 10 min delay
                // We do this by launching a separate effect or just updating a trigger
                scope.launch {
                    delay(20000L) // 10 minutes
                    if (!hasRated) showDialog = true
                }
            },
            onRateClick = {
                showDialog = false
                scope.launch {
                    mainViewModel.dataStore.markAsRated()
                }
            }
        )
    }

    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Scaffold(
            modifier = Modifier
                .fillMaxWidth(if(largeScreen)1f else 0.7f)
//                .fillMaxWidth()
//                .widthIn(max = 840.dp),
                ,
            topBar = {
                if (showTopBar) {
                    MyTopAppBar(
                        nav = navController,
                        title = title,
                        onDrawableClicked = {
                            if (currentRoute?.contains(ScreenRoutes.NotesDetails.route) == true) {
                                handleSmartBack(navController)
                            } else {
                                navController.popBackStack()
                            }
                        },

                        dataStoreManager = mainViewModel.dataStore,
                        currentRoute = currentRoute,
                        editorRef = editorRef,
                        subId = openedsubId


                    )
                }


            },
            bottomBar = {
                // Only show if showBottomBar is true
                if (showBottomBar) {
                    LuxuryBottomBar(navController)
                }
            },


            )
        { innerPadding ->
            NavHost(
                navController = navController,
                startDestination =
//                    if (isComplete == true)
                    ScreenRoutes.DashBoard.route
//                    else ScreenRoutes.Onboarding.route
                ,
                Modifier
                    .padding(innerPadding)
                    .fillMaxSize()

            ) {
//                composable(ScreenRoutes.Onboarding.route) {
//                    OnboardingScreen(
//                        onGuideComplete = {
//
//                            CoroutineScope(Dispatchers.IO).launch {
//                                mainViewModel.completeOnboarding()
//                            }
//                            navController.navigate(ScreenRoutes.DashBoard.route) {
//                                popUpTo(ScreenRoutes.Onboarding.route) { inclusive = true }
//                            }
//                        }
//                    )
//                }

                composable(ScreenRoutes.DashBoard.route) {
                    val dashboardViewModel: DashboardViewModel = hiltViewModel()
                    Dashboard(
                        nav = navController,
                        viewModel = dashboardViewModel,
                        dataStoreManager = mainViewModel.dataStore
                    )
                }

                composable(ScreenRoutes.Notes.route) {
                    Notes(
                        navController,
                        mainViewModel.dataStore
                    )
                }

                composable(ScreenRoutes.Compiler.route) {
                    Compiler(
                        initialCode = "",
                        dataStoreManager = mainViewModel.dataStore,
                        editorRef
                    )
                }

                composable(ScreenRoutes.Projects.route) {
                    Projects(
                        navController = navController,
                        dataStoreManager = mainViewModel.dataStore
                    )
                }
                composable(
                    route = "${ScreenRoutes.Compiler.route}/{code}",
                    arguments = listOf(navArgument("code") {
                        type = NavType.StringType; nullable = true
                    })
                ) { backStackEntry ->
                    val encodedCode = backStackEntry.arguments?.getString("code")


//                    val decodedCode = encodedCode?.let {
//                        java.net.URLDecoder.decode(it, java.nio.charset.StandardCharsets.UTF_8.toString())
//                    }

                    val decodedCode = try {
                        encodedCode?.let {
                            val decodedBytes = android.util.Base64.decode(
                                it,
                                android.util.Base64.URL_SAFE or android.util.Base64.NO_WRAP
                            )
                            String(decodedBytes, java.nio.charset.StandardCharsets.UTF_8)
                        }
                    } catch (e: Exception) {
                        Log.d("error", "Fallback if decoding fails")
                        null // Fallback if decoding fails
                    }


                    Compiler(
                        initialCode = decodedCode,
                        dataStoreManager = mainViewModel.dataStore,
                        editorRef = editorRef
                    )
                }


                composable("${ScreenRoutes.NotesDetails.route}/{subId}") { backStackEntry ->
                    val subId = backStackEntry.arguments?.getString("subId")?.toIntOrNull() ?: 0

                    LaunchedEffect(subId) {
                        openned_sub = notesRepo.getSubtopicName(subId)
                        openedsubId=subId

                    }

                    val headLines = remember(subId) {

                        notesRepo.fetchSubtopicNotes(subId)

                    }

//                     openned_sub= notesRepo.getSubtopicName(subId)

                    NotesDetails(
                        headLines = headLines,
                        navController = navController,
                        dataStoreManager = mainViewModel.dataStore,
                        subId = subId
                    )
                }
                composable(ScreenRoutes.Settings.route) {
                    Settings(
                        dataStoreManager = mainViewModel.dataStore,
                        navController = navController
                    )
                }

                composable(ScreenRoutes.Search.route) {
                    val searchViewModel: SearchViewModel = hiltViewModel()
                    Search(viewModel = searchViewModel, navController = navController)
                }
                composable(ScreenRoutes.Samples.route) { Sampler(navController = navController) }
                composable(ScreenRoutes.About.route) { AboutScreen() }
                composable(ScreenRoutes.AboutUs.route) { AboutUs() }


                composable("${ScreenRoutes.Quiz.route}/{subId}") { backStackEntry ->
                    val subId = backStackEntry.arguments?.getString("subId")?.toIntOrNull() ?: 0
                    val subtopic = notesRepo.getSubtopicById(subId) // Implement this in repo

                    Quiz(
                        questions = subtopic?.questions ?: emptyList(),
                        onQuizComplete = { percentage ->
                            scope.launch {
                                mainViewModel.dataStore.saveQuizProgress(subId, percentage)
                                navController.popBackStack()
                            }
                        }
                    )
                }




            }
        }

    }
}






