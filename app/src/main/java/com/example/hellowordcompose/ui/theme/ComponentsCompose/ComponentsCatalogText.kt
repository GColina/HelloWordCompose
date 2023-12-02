package com.example.hellowordcompose.ui.theme.ComponentsCompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun ShowPreviewTextFields() {
    Column(Modifier.fillMaxSize()) {
        MyTextFieldAdvance2()
        MyTextFieldAdvance()
        Mytext()
        MyTextField()
    }
}


@Composable
fun MyTextFieldAdvance() {
    //Con esta funcion El usuario verá un cuadro de texto con la etiqueta "Introduce tu nombre".
// El cuadro de texto estará vacío al principio, pero el usuario podrá introducir su nombre escribiendo en él.
    var myText by remember { mutableStateOf("") }
    TextField(value = myText,
        onValueChange = { myText = it },
        label = { Text(text = "Introduce tu nombre") })

}

@Composable
fun MyTextFieldAdvance2() {
    //Esta funcion es la misma que la de arriba, lo que te enseña, que tambien puedes bloquear al  usuario a
    // escribir segun que caracteres, o palabras.
    var myText by remember { mutableStateOf("") }
    TextField(value = myText, onValueChange = {
        myText = if (it.contains("a")) {
            it.replace("a", "")
        } else {
            it
        }
    }, label = { Text(text = "Introduce tu nombre") })
}


@Composable
fun MyTextField() {
    var myText by remember { mutableStateOf("Hola") }
    TextField(value = myText, onValueChange = { myText = it })
}


@Composable
fun Mytext() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Esto es un Ejemplo")
        Text(text = "Esto es un Ejemplo", color = Color.Blue)
        Text(text = "Esto es un Ejemplo", fontWeight = FontWeight.ExtraBold)
        Text(text = "Esto es un Ejemplo", fontWeight = FontWeight.Light)
        Text(text = "Esto es un Ejemplo", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(
            text = "Esto es un Ejemplo",/* Se puede crear directamente sin el atributo style = TextStyle(), como en el ejemplo de abajo.
             Esto es mas para meterle vaios atributos Style*/
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(
            text = "Esto es un Ejemplo",
            // Ejemplo 2
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Esto es un Ejemplo", style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(TextDecoration.Underline, TextDecoration.LineThrough)
                )
            )
        )
        Text(text = "Esto es un Ejemplo", fontSize = 30.sp)

    }
}