package com.example.sweatnote.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sweatnote.Calender.CalendarScreen
import com.example.sweatnote.graphViews.StatsScreen
import com.example.sweatnote.screens.Statistics
import com.example.sweatnote.screens.Writing
import com.example.sweatnote.screens.Written
import com.example.sweatnote.example.DiaryViewModel
import com.example.sweatnote.screens.*

@Composable
fun NavGraph(navController: NavHostController, diaryViewModel: DiaryViewModel) {
    NavHost(navController=navController, startDestination = Routes.Main.route) {

        composable(route=Routes.Main.route) {
            CalendarScreen(navController)
        }

        composable(route=Routes.Search.route) {
            Search(navController)
        }

        composable(route=Routes.Statistics.route) {
            val diaryViewModel: DiaryViewModel = viewModel()
            StatsScreen(navController = navController, viewModel = diaryViewModel)
        }

        composable(route=Routes.Writing.route) {
            Writing(navController, diaryViewModel)
        }

        composable(route=Routes.Written.route) {
            Written(navController)
        }

    }
}
