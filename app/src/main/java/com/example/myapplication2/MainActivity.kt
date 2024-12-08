package com.example.myapplication2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import com.example.myapplication2.ui.theme.MyApplication2Theme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication2.screens.HeroListScreen
import com.example.myapplication2.screens.HeroDetailScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            HeroApp(navController)
        }
    }
}

@Composable
fun HeroApp(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "hero_list") {
        composable("hero_list") {
            HeroListScreen(navController = navController)
        }
        composable(
            route = "hero_detail/{name}/{image}/{description}",
            arguments = listOf(
                navArgument("name") { type = NavType.StringType },
                navArgument("image") { type = NavType.StringType },
                navArgument("description") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: ""
            val image = backStackEntry.arguments?.getString("image") ?: ""
            val description = backStackEntry.arguments?.getString("description") ?: ""
            HeroDetailScreen(
                navController = navController,
                name = name,
                image = image,
                description = description
            )
        }
    }
}

