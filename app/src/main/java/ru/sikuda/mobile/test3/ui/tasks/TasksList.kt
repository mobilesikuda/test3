package ru.sikuda.mobile.test3.ui.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun TasksList(
    selectedTask: (Int) -> Unit
) {
    Scaffold(
//        topBar = {
//            Row {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_puppy_icon),
//                    contentDescription = stringResource(R.string.content_desc_app_icon),
//                    modifier = Modifier
//                        .size(88.dp)
//                        .padding(top = 16.dp)
//                )
//                Text(
//                    text = stringResource(id = R.string.app_bar_title),
//                    style = MaterialTheme.typography.h3,
//                    modifier = Modifier
//                        .padding(8.dp)
//                )
//            }
//        }
    ) { paddingValues ->
        //TasksListBody(selectedCat, paddingValues)
    }
}