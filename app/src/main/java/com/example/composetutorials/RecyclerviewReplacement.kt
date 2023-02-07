package com.example.composetutorials

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.composetutorials.models.PersonRepo

@Composable
fun CustomLazyColumn() {
    val personsList = PersonRepo().allData
    LazyColumn() {

    }
}