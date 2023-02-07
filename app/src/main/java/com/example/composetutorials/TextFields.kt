package com.example.composetutorials

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@Composable
fun CustomTextField() {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 5.dp),
        label = {
            Text(text = "Type here...")
        },
        leadingIcon = {
            IconButton(onClick = {
                text = ""
            }) {
                Icon(imageVector = Icons.Filled.Close, contentDescription = "Keyboard input")
            }
        },
        placeholder = { Text(text = "type anything") },
        trailingIcon = {
            IconButton(onClick = {
                text = ""
            }) {
                Icon(imageVector = Icons.Filled.Check, contentDescription = "Keyboard input")
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Go),
        keyboardActions = KeyboardActions(onGo = {
            println("up ime go clicked")
        })
    )
}