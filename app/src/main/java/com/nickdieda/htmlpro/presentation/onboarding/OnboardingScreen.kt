package com.nickdieda.htmlpro.presentation.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(onGuideComplete: () -> Unit) {
    val pagerState = rememberPagerState(pageCount = { onboardingPages.size })
    val coroutineScope = rememberCoroutineScope()

    Column(Modifier.fillMaxSize()) {
        // --- 1. The Swipable Content (Pager) ---
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f) // Takes up most of the space
        ) { pageIndex ->
            OnboardingPageContent(page = onboardingPages[pageIndex])
        }

        // --- 2. Indicators and Controls ---
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // SKIP Button
            if (pagerState.currentPage < onboardingPages.size - 1) {
                TextButton(onClick = onGuideComplete) {
                    Text("Skip")
                }
            } else {
                // Spacer for layout consistency
                Spacer(modifier = Modifier.width(48.dp))
            }


            // Page Indicators (Dots)
            HorizontalPagerIndicator(
                pagerState = pagerState,
                pageCount = onboardingPages.size,
                activeColor = MaterialTheme.colorScheme.primary
            )


            // NEXT/FINISH Button
            val buttonText = if (pagerState.currentPage == onboardingPages.size - 1) "Finish" else "Next"
            Button(
                onClick = {
                    if (pagerState.currentPage < onboardingPages.size - 1) {
                        // Move to the next page
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    } else {
                        // Guide is complete
                        onGuideComplete()
                    }
                }
            ) {
                Text(buttonText)
            }
        }
    }
}