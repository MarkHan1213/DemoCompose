package com.mark.democompose.ui

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mark.democompose.ui.data.Chat
import com.mark.democompose.ui.theme.*
import com.mark.democompose.ui.wiget.TopBar
import com.mark.democompose.unread


@Composable
fun chatListPage(chats: List<Chat>) {
    Column(Modifier.fillMaxSize()) {
        ChatListTopBar()
        Box(
            modifier = Modifier
                .background(white2)
                .fillMaxSize()
        ) {
            ChatList(chats = chats)
        }
    }
}

@Composable
private fun ChatList(chats: List<Chat>) {
    LazyColumn(
        Modifier
            .fillMaxWidth()
            .background(white)
    ) {
        itemsIndexed(chats) { index, chat ->
            ChatListItem(chat = chat)
            if (index < chats.size - 1) {
                Divider(
                    startIndent = 68.dp,
                    color = white3,
                    thickness = 0.8f.dp
                )
            }
        }
    }
}

@Composable
fun ChatListTopBar() {
    TopBar(title = "WeChat")
}


@Composable
fun ChatListItem(chat: Chat) {
    val context = AmbientContext.current
    Row(
        Modifier
            .fillMaxWidth()
            .clickable {
                chat.msgs.last().read = true;
                Toast
                    .makeText(context, "你点到我了", Toast.LENGTH_SHORT)
                    .show()
            }) {
        Image(
            vectorResource(id = chat.friend.avatar),
            Modifier
                .padding(12.dp, 8.dp, 8.dp, 8.dp)
                .size(48.dp)
                .unread(chat.msgs.last().read)
                .clip(RoundedCornerShape(5.dp))
        )
        Column(
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        ) {
            Text(text = chat.friend.name, fontSize = 18.sp, color = black3)
            Text(chat.msgs.last().text, fontSize = 14.sp, color = grey1)
        }
        Text(
            text = chat.msgs.last().time,
            Modifier.padding(8.dp, 8.dp, 12.dp, 8.dp),
            fontSize = 11.sp,
            color = grey1
        )
    }
}
