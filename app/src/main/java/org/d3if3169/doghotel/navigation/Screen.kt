package org.d3if3169.doghotel.navigation


sealed class Screen (val route: String) {
    data object Landing: Screen("landingScreen")
    data object Main: Screen("mainScreen")
    data object About: Screen("aboutScreen")
    data object Form: Screen("formScreen")
    data object Rules: Screen("rulesScreen")
    data object Notes: Screen("notesScreen")
}