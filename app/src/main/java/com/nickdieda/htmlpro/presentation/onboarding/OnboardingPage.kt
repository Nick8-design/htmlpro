package com.nickdieda.htmlpro.presentation.onboarding

import com.nickdieda.htmlpro.R


data class OnboardingPage(
    val title: String,
    val description: String,
    // You could also add a resource ID for an icon or illustration
    val imageResId: Int
)

// Define the list of pages
val onboardingPages = listOf(
    OnboardingPage("Welcome! 🎉", "Explore our new features...", R.drawable.wellcome),
    OnboardingPage("Navigation 🧭", "Use the tabs below to switch views.", R.drawable.images),
    OnboardingPage("Finished! ✅", "You're all set to go!", R.drawable.finish)
)