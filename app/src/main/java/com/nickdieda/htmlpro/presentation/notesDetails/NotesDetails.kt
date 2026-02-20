package com.nickdieda.htmlpro.presentation.notesDetails


import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nickdieda.htmlpro.data.model.Headline
import com.nickdieda.htmlpro.functions.JsCodeEditor
import com.nickdieda.htmlpro.navigation.ScreenRoutes
import com.nickdieda.htmlpro.store.DataStoreManager

@Composable
fun NotesDetails(
//    subtopicName:String,
    subId: Int,
    headLines: List<Headline>,
    navController: NavController,
    dataStoreManager: DataStoreManager

) {
    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()
    BackHandler {
        handleSmartBack(navController)
    }

//    val savedPosition by dataStoreManager.getScrollPosition(subId).collectAsState(initial = Pair(0, 0))
//
//
//
//    LaunchedEffect(savedPosition) {
//        if (savedPosition.first > 0 || savedPosition.second > 0) {
//            listState.scrollToItem(savedPosition.first, savedPosition.second)
//        }
//    }

    // 3. Save Position and Progress while scrolling
    LaunchedEffect(listState.firstVisibleItemIndex, listState.firstVisibleItemScrollOffset) {
        dataStoreManager.saveLastPosition(
            subId = subId,
            index = listState.firstVisibleItemIndex,
            offset = listState.firstVisibleItemScrollOffset
        )
    }

    // 1. Calculate Progress
    val scrollProgress by remember {
        derivedStateOf {
            val layoutInfo = listState.layoutInfo
            val visibleItemsInfo = layoutInfo.visibleItemsInfo

            if (visibleItemsInfo.isEmpty()) {
                0f
            } else {
                val lastVisibleItem = visibleItemsInfo.last()
                val totalItemsCount = layoutInfo.totalItemsCount

                // Check if we are at the end or if the list isn't scrollable
                val isAtEnd = lastVisibleItem.index == totalItemsCount - 1
                val isLastItemFullyVisible =
                    lastVisibleItem.offset + lastVisibleItem.size <= layoutInfo.viewportEndOffset

                if (isAtEnd && isLastItemFullyVisible) {
                    1f // 100%
                } else if (totalItemsCount <= 1) {
                    1f // Single page / not scrollable
                } else {
                    // Estimate progress based on index
                    (lastVisibleItem.index.toFloat() / (totalItemsCount - 1)).coerceIn(0f, 1f)
                }
            }
        }
    }

    // 2. Save progress when it changes
    LaunchedEffect(scrollProgress) {
        if (scrollProgress > 0f) {
            dataStoreManager.saveSubtopicProgress(subId, scrollProgress)
        }
    }




    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        items(headLines) { headline ->
            HeadlineItem(headline = headline,

                // Inside HeadlineItem onClick or onTryItOut
                onTryItOut = { code ->
                    // Use Base64 instead of URLEncoder
                    val codeBytes = code.toByteArray(java.nio.charset.StandardCharsets.UTF_8)
                    val encodedCode = android.util.Base64.encodeToString(codeBytes, android.util.Base64.URL_SAFE or android.util.Base64.NO_WRAP)

                    navController.navigate("${ScreenRoutes.Compiler.route}/$encodedCode")
                }
//
//                onTryItOut = { code ->
//
//                val encodedCode = URLEncoder.encode(code, StandardCharsets.UTF_8.toString())
//
//                navController.navigate("${ScreenRoutes.Compiler.route}/$encodedCode")
//            }



            )
        }
    }

}



fun handleSmartBack(navController: NavController) {
    val hasNotesInStack = navController.previousBackStackEntry?.destination?.route == ScreenRoutes.Notes.route

    if (hasNotesInStack) {
        navController.popBackStack() // Just go back to Notes where we were
    } else {
        // We came from Dashboard or elsewhere, so jump to Notes screen
        navController.navigate(ScreenRoutes.Notes.route) {
            // Avoid building up a huge stack
            popUpTo(ScreenRoutes.DashBoard.route)
        }
    }
}

@Composable
fun HeadlineItem(
    headline: Headline,
    onTryItOut: (String) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {

        if (!headline.majorHeadline.isNullOrEmpty()) {
            Text(
                text = headline.majorHeadline,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
        }



        if (!headline.majorHeadileExplanation.isNullOrEmpty()) {
            Text(
                text = headline.majorHeadileExplanation,
                style = MaterialTheme.typography.bodyLarge,
                lineHeight = 24.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
        }

        // 2. Specific Headline & Explanation
        if (!headline.headline.isNullOrEmpty()) {
            Text(
                text = headline.headline,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(4.dp))
        }

        if (!headline.explaination.isNullOrEmpty()) {
            Text(
                text = headline.explaination,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(12.dp))
        }

        // 3. Code Section (Using Rosemoe Sora Editor)
        if (!headline.codeExample.isNullOrEmpty()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E1E)), // Dark background for code
                shape = RoundedCornerShape(8.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                        .heightIn(min = 10.dp, max = 180.dp)

                    ) { // Fixed height for code block
                        JsCodeEditor(
                            modifier = Modifier
                                ,
                            editorRef = { editor ->
                            editor.setText(headline.codeExample)
                            editor.isEditable = false
                        })
                    }

                    // Try It Out Button
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()

                            .padding(8.dp),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        Button(
                            onClick = { onTryItOut(headline.codeExample) },
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                        ) {
                            Text("Try it Out")
                        }
                    }
                }
            }

            // Code Output and After-Code Explanations
            if (!headline.codeOutput.isNullOrEmpty()) {
                Text(
                    text = "Output: ${headline.codeOutput}",
                    modifier = Modifier.padding(top = 8.dp),
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Green,
//                    fontWeight = FontWeight.Monospace
                )
            }

            if (!headline.afterCodeEplainations.isNullOrEmpty()) {
                Text(
                    text = headline.afterCodeEplainations,
                    modifier = Modifier.padding(top = 8.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        // 4. Tip Card
        if (!headline.tip.isNullOrEmpty()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "💡",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(end = 12.dp)
                    )
                    Text(
                        text = headline.tip,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onTertiaryContainer
                    )
                }
            }
        }

//        HorizontalDivider(
//            modifier = Modifier.padding(vertical = 16.dp),
//            thickness = 0.5.dp,
//            color = MaterialTheme.colorScheme.outlineVariant
//        )
    }
}
