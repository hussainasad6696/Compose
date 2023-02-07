package com.example.composetutorials

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorials.models.Person


@Composable
fun CustomListItem(person: Person) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Start)) {
                withStyle(style = SpanStyle(color = Color.LightGray, fontWeight = FontWeight.Bold, fontSize = 18.sp)) {
                    append(person.name[0])
                }
                append(person.name.substring(1))
            }
        }, color = Color.White, modifier = Modifier.weight(6f))
        Text(text = "${person.age}", color = Color.White, modifier = Modifier.weight(1f))
    }
}