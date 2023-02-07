package com.example.composetutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorials.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                ) {
                    Column(Modifier.padding(5.dp)) {
                        ExpandAblCard()
                        CustomTextField()
                        GoogleButton()
                        GradientButton()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Text(
        text = stringResource(id = R.string.app_name),
        modifier = Modifier
            .background(MaterialTheme.colors.secondary)
            .padding(10.dp)
            .fillMaxWidth(),
        color = Color.White,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.End
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column {
                ExpandAblCard()
                CustomTextField()
                GoogleButton()
                GradientButton()
            }
        }
    }
}