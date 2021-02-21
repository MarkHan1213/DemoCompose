package com.mark.democompose.ui.wiget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mark.democompose.ui.theme.black3
import com.mark.democompose.ui.theme.white1

@Composable
fun TopBar(title: String) {
    Box(
        Modifier
            .fillMaxWidth()
            .background(white1)
    ) {
        Row(Modifier.preferredHeight(48.dp)) {
        }
        Text("+", Modifier.align(Alignment.CenterEnd).padding(10.dp), color = black3)
        Text(title, Modifier.align(Alignment.Center), color = black3)
    }
}