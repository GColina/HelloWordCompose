package com.example.hellowordcompose.ui.theme.ComponentsCompose

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp





@Preview(showBackground = true)
@Composable
fun PrintExample() {
    MyStateExample()
}


@Composable
fun MyStateExample() {
    var counter by rememberSaveable { mutableStateOf(0) }
    Column(
        Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado $counter veces")
    }
}


@Composable
fun MySpacer(size: Int) {
    Spacer(
        modifier = Modifier
            .height(size.dp)
            .fillMaxWidth()
            .background(color = Color.Black)
    )
}


@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {

        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), Alignment.Center
        ) {
            Text(text = "Ejemplo1 ")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color.Red), Alignment.Center
            ) {
                Text(text = "Ejemplo2 ")
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color.Green), contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola soy Gabriel.")

            }

        }
        MySpacer(24)
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta), Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo4 ")

        }

        @Composable
        fun MyRow() {/*Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Ejemplo1")
            Text(text = "Ejemplo2")
            Text(text = "Ejemplo3")
            Text(text = "Ejemplo4")
        }*/
            Row(
                Modifier
                    .fillMaxSize()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
                Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
            }

        }

        @Composable
        fun MyColumn() {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "Ejemplo1", modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo2",
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo3",
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo4", modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo1", modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo2",
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo3",
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo4", modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo1", modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo2",
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo3",
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo4", modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo1", modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo2",
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo3",
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxWidth()
                        .height(100.dp)
                )
                Text(
                    "Ejemplo4", modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxWidth()
                        .height(100.dp)
                )
            }
        }


        @Composable
        fun MyBox() {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Box(
                    modifier = Modifier
                        .width(30.dp)
                        .height(50.dp)
                        .background(color = Color.Cyan)
                        .verticalScroll(rememberScrollState())
                ) {
                    Text("Esto es un Ejemplo")
                }
            }
        }
    }
}