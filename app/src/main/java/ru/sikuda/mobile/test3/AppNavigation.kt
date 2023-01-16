package ru.sikuda.mobile.test3

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ru.sikuda.mobile.test3.AppDestinations.TASK_DETAIL_ID_KEY
import ru.sikuda.mobile.test3.ui.tasks.TasksList

/**
 * Destinations used in the App.
 */
private object AppDestinations {
    const val ROOT_ROUTE = "root"
    const val TASKS_ROUTE = "tasks"
    const val TASK_DETAIL_ROUTE = "task"
    const val TASK_DETAIL_ID_KEY = "taskId"
}

@Composable
fun AppNavigation(
    startDestination: String = AppDestinations.ROOT_ROUTE
) {
    val navController = rememberNavController()
    val actions = remember(navController) { AppActions(navController) }

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            AppDestinations.ROOT_ROUTE
        ) {
            DefaultPreview()
        }
        composable(
            AppDestinations.TASKS_ROUTE
        ) {
            TasksList(selectedTask = actions.selectedTask)
        }
        composable(
            "${AppDestinations.TASK_DETAIL_ROUTE}/{$TASK_DETAIL_ID_KEY}",
            arguments = listOf(
                navArgument(TASK_DETAIL_ID_KEY) {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            //CatDetails(
            //    catId = arguments.getInt(CAT_DETAIL_ID_KEY),
            //    navigateUp = actions.navigateUp
            //)
        }
    }
}

private class AppActions(
    navController: NavHostController
) {
    val selectedTask: (Int) -> Unit = { catId: Int ->
        navController.navigate("${AppDestinations.TASK_DETAIL_ROUTE}/$catId")
    }

    val listTasks: () -> Unit = {
        navController.navigate(AppDestinations.TASKS_ROUTE)
    }

    val navigateUp: () -> Unit = {
        navController.navigateUp()
    }
}
