package ru.sikuda.mobile.test3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sikuda.mobile.test3.ui.theme.Test3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Test3Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {

            val buttonsList = arrayOf("Задания", "Разгрузки", "Навалы")

            Row(verticalAlignment = Alignment.CenterVertically) {

                LazyVerticalGrid(
                    cells = GridCells.Fixed(2),
                    Modifier.padding(
                        start = 10.dp,
                        end = 10.dp,
                        top = 10.dp,
                        bottom = 10.dp
                    )
                ) {
                    items(buttonsList.size) {

                        Column( verticalArrangement = Arrangement.Center ) {

                            Image(
                                //ImageVector.vectorResource(R.mipmap.ic_launcher),
                                ImageVector.vectorResource(R.drawable.ic_launcher_background),
                                //imageVector = Icons.Default.AccountCircle,
                                contentDescription = "Localized description",
//                                colorFilter = ColorFilter.tint(Color(0xFFDA1884),
                                )


                            Button(
                                onClick = {


                                },
                                modifier = Modifier.padding(all = 0.dp),
                                colors = ButtonDefaults.buttonColors(MaterialTheme.colors.background),
                                //colors = ButtonDefaults.buttonColors(Color.LightGray)
                            ) {
                                Text(
                                    text = "${buttonsList[it]}",
                                    color = Color.Black,
                                    fontSize = 15.sp
                                )
                            }
                        }

                    }
                }
            }

        }
    }
}

