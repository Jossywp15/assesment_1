package org.d3if3169.doghotel.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.d3if3169.doghotel.ui.screen.AboutScreen
import org.d3if3169.doghotel.ui.screen.FormScreen
import org.d3if3169.doghotel.ui.screen.LandingScreen
import org.d3if3169.doghotel.ui.screen.MainScreen
import org.d3if3169.doghotel.ui.screen.NotesScreen
import org.d3if3169.doghotel.ui.screen.RulesScreen

@Composable
fun SetUpnavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = "landingScreen"
    ) {
        composable("landingScreen") {
            LandingScreen(navHostController = navController)
        }
        composable("mainScreen") {
            MainScreen(navHostController = navController)
        }
        composable("aboutScreen") {
            AboutScreen(navHostController = navController)
        }
        composable("formScreen") {
            FormScreen(navHostController = navController)
        }
        composable("rulesScreen") {
            RulesScreen(navHostController = navController)
        }
        composable("notesScreen") {
            NotesScreen(navHostController = navController)
        }
    }
}
