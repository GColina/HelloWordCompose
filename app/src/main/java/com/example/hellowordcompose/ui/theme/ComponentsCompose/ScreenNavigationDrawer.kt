package com.example.hellowordcompose.ui.theme.ComponentsCompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


/* Este ejemplo se basa en un video de Martin Kiperszmid : Navigation Drawer en Jetpack Compose
https://www.youtube.com/watch?v=IZNxE3-445A&ab_channel=MartinKiperszmid%7CProgramador */



@Preview
@Composable
fun ShowPreviewDrawer() {
    ScreenNavigationDrawer()
}

@Composable
fun ScreenNavigationDrawer() {

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(scaffoldState = scaffoldState,
        topBar = {
            Topbar {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }
        },
        drawerContent = {
            NavigatioDrawer(
                name = "GColina",
                email = "Gcolinar@gmail.com",
                items = DrawerItem.values().toList(),
            ) {
                when (it) {
                    //Ahora dentro de cada uno podriamos meterle la logica necesaria para cada uno, en base a los que creemos o lo que necesitemos.
                    DrawerItem.ABOUT -> {
                        println()
                    }

                    DrawerItem.SETTINGS -> {
                        println()
                    }

                    DrawerItem.RECENT -> {
                        println()
                    }

                    DrawerItem.UPLOADS -> {
                        println()
                    }
                }
                //Ahora esta que vamos a generar sera una pequena opcion que tiene el drawer,en la que cuando apretas cualquier
                // boton se cierra automaticamente y si tambien hay que meterlo en una funcion scope, para meterlo en corrutina.
                scope.launch {
                    scaffoldState.drawerState.close()
                }

            }
        }
    ) {


    }

}


//Se tendria que crear un componente aparte dentro de otro archivo.kt, pero como esto
//Es un ejemplo continuaremos por aqui.

@Composable
fun Topbar(
    onMenuclick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = "Navigation Drawer 123")
        },
        navigationIcon = {
            IconButton(onClick = { onMenuclick() }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Button Menu"
                )

            }
        }
    )
}

//Ahora tendremos que crear el Navigation Drawer, que es el listado de cosas que le enviaremos al drawer

@Composable
fun NavigatioDrawer(
    name: String,
    email: String,
    // A este parametro items le tengo que pasar el listado de botones que le quiero enviar al drawer osea a este menu desplegable.
    items: List<DrawerItem>,
    modifier: Modifier = Modifier,
    onItemClick: (DrawerItem) -> Unit
) {
    // Si tuvieramos muchos iconos sin problema se puede hacer una LazyColum
    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = email)
        Divider()
        // Ahora vamos a llamar al listado que hemos creado de opciones que saldran en este drawer ("Menu desplegable")
        items.forEach {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onItemClick(it)
                    }
                    .padding(16.dp), verticalAlignment = CenterVertically
            ) {
                Icon(imageVector = it.icon, contentDescription = it.text)
                Spacer(modifier = Modifier.width(32.dp))
                Text(text = it.text)
            }
        }

    }
}


// Para pasarle este Listado lo mejor es un enum class.

enum class DrawerItem(
    val icon: ImageVector,
    val text: String,

    ) {
    ABOUT(Icons.Default.Info, "About"),
    SETTINGS(Icons.Default.Settings, "Settings"),
    RECENT(Icons.Default.DateRange, "Recent"),
    UPLOADS(Icons.Default.ThumbUp, "Recent"),


}
