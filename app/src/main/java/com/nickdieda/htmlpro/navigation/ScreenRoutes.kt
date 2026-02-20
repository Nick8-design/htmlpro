package com.nickdieda.htmlpro.navigation

sealed class ScreenRoutes(val route: String) {

    object DashBoard: ScreenRoutes("dashboard")
    object Notes : ScreenRoutes("notes")
    object Compiler : ScreenRoutes("compiler")

    object Projects : ScreenRoutes("projects")
    object Settings : ScreenRoutes("settings")
    object Onboarding : ScreenRoutes("onboarding")
    object NotesDetails : ScreenRoutes("NotesDetails")
    object Quiz: ScreenRoutes("quiz")
    object Search : ScreenRoutes("search")
    object Samples : ScreenRoutes("samples")

    object About : ScreenRoutes("About")
    object AboutUs : ScreenRoutes("AboutUs")


}
