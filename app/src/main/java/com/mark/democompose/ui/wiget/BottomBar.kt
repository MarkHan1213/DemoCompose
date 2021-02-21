package com.mark.democompose.ui.wiget

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.viewModel
import com.mark.democompose.R
import com.mark.democompose.ui.data.WeChatViewModel
import com.mark.democompose.ui.theme.black
import com.mark.democompose.ui.theme.green3
import com.mark.democompose.ui.theme.white1


@Composable
fun weChatBottomBar(selectedIndex: Int,currentChanged: (Int) -> Unit) {
    val viewMode: WeChatViewModel = viewModel()
    Row(Modifier.background(white1)) {
        TabItem(
            if (selectedIndex == 0) R.drawable.ic_chat_filled else R.drawable.ic_chat_outlined,
            "聊天",
            if (selectedIndex == 0) green3 else black,
            Modifier
                .weight(1f)
                .clickable {
                    currentChanged(0)
                },
        )
        TabItem(
            if (selectedIndex == 1) R.drawable.ic_contacts_filled else R.drawable.ic_contacts_outlined,
            "通讯录",
            if (selectedIndex == 1) green3 else black,
            Modifier
                .weight(1f)
                .clickable {
                    currentChanged(1)
                }
        )
        TabItem(
            if (selectedIndex == 2) R.drawable.ic_discover_filled else R.drawable.ic_discover_outlined,
            "发现",
            if (selectedIndex == 2) green3 else black,

            Modifier
                .weight(1f)
                .clickable {
                    currentChanged(2)
                }
        )
        TabItem(
            if (selectedIndex == 3) R.drawable.ic_me_filled else R.drawable.ic_me_outlined,
            "我",
            if (selectedIndex == 3) green3 else black,
            Modifier
                .weight(1f)
                .clickable {
                    currentChanged(3)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWeChatBottomBar() {
    weChatBottomBar(selectedIndex = 1){}
}

@Composable
private fun TabItem(@DrawableRes iconId: Int, title: String, color: Color, modifier: Modifier) {
    Column(
        modifier.padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            vectorResource(iconId),
            Modifier.size(24.dp),
            tint = color,
        )
        Text(title, fontSize = 11.sp, color = color)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTabItem() {
    TabItem(iconId = R.drawable.ic_chat_outlined, title = "聊天", black, Modifier.padding(1.dp))
}