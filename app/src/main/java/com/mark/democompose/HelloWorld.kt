package com.mark.democompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// UI 被认定为一个函数， Text()是一个Compose函数
@Composable
fun HelloWorld() {
    Text(text = "Hello World")
}


//@Preview(showBackground = true)
@Preview(showSystemUi = false)
@Composable
fun PreviewHelloWorld() {
    HelloWorld()
}


@Composable
fun ImageAndText() {
    Column(Modifier.padding(20.dp)) {
        Image(
            imageResource(id = R.drawable.iron_man),
            Modifier
                .clip(RoundedCornerShape(5.dp))
                .fillMaxWidth()
                .preferredHeight(180.dp),
            contentScale = ContentScale.Crop
        )
        Text(text = "钢铁侠", Modifier.align(Alignment.CenterHorizontally), color = Color.White)
    }
}

@Preview()
@Composable
fun PreviewImageAndText() {
    ImageAndText()
}
