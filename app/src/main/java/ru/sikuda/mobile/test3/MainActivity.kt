@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package ru.sikuda.mobile.test3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sikuda.mobile.test3.ui.theme.Test3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
            //DefaultPreview()
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val context = LocalContext.current

    Test3Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {

            val buttonsList = arrayOf("Задания", "Разгрузки", "Навалы")

            LazyVerticalGrid(
                cells = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.Center,
                verticalArrangement = Arrangement.Center

            ) {
                items(buttonsList.size) { item ->

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(20.dp)
                            .selectable(
                                true,
                                onClick = {
                                    //listTasks()
                                    //Toast(context, "Click ${buttonsList[item]}")
                                }
                            )
                    ) {

                        Image(
                            ImageVector.vectorResource(R.drawable.ic_launcher_background),
                            contentDescription = buttonsList[item],
                            alignment = Alignment.TopCenter
                        )

                        Text(
                            text = buttonsList[item],
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            //modifier = Modifier.padding(20.dp)
                        )
                   }
                }
            }

        }
    }
}

//fun Toast(context: Context, message: CharSequence) =
//    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

