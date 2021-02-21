package com.mark.democompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.viewModel
import androidx.lifecycle.ViewModel
import com.mark.democompose.ui.data.User
import com.mark.democompose.ui.wiget.TopBar

import com.mark.democompose.R
import com.mark.democompose.ui.data.WeChatViewModel
import com.mark.democompose.ui.theme.*


@Composable
fun ContactListTopBar() {
    TopBar(title = "通讯录")
}

@Preview(showBackground = true)
@Composable
fun PreviewContactListTopBar() {
    ContactListTopBar()
}

@Composable
fun ContactList(viewModel: WeChatViewModel = viewModel()) {
    Column(Modifier.fillMaxSize()) {
        ContactListTopBar()
        Box(
            modifier = Modifier
                .background(white2)
                .fillMaxSize()
        ) {
            ContactList(contacts = viewModel.contacts)
        }

    }
}

@Composable
fun ContactList(contacts: List<User>) {
    LazyColumn(
        Modifier
            .background(white)
            .fillMaxWidth()
    ) {
        val tops = listOf(
            User("contact_add", "新的朋友", R.drawable.ic_contact_add),
            User("contact_chat", "仅聊天", R.drawable.ic_contact_chat),
            User("contact_group", "群聊", R.drawable.ic_contact_group),
            User("contact_tag", "标签", R.drawable.ic_contact_tag),
            User("contact_official", "公众号", R.drawable.ic_contact_official),
        )
        itemsIndexed(tops) { index, item ->
            ContactListItem(item)
            if (index < tops.size - 1) {
                Divider(
                    startIndent = 56.dp,
                    color = white3,
                    thickness = 0.8f.dp
                )
            }
        }

        item {
            Text(
                "朋友",
                Modifier
                    .background(white2)
                    .fillMaxWidth()
                    .padding(12.dp, 8.dp),
                fontSize = 14.sp,
                color = grey3
            )
        }
        itemsIndexed(contacts) { index, contact ->
            ContactListItem(contact)
            if (index < contacts.size - 1) {
                Divider(
                    startIndent = 56.dp,
                    color = white3,
                    thickness = 0.8f.dp
                )
            }
        }
    }

}

@Composable
fun ContactListItem(contact: User) {
    Row(Modifier.fillMaxWidth()) {
        Image(
            vectorResource(id = contact.avatar),
            Modifier
                .padding(12.dp, 8.dp, 8.dp, 8.dp)
                .size(36.dp)
                .clip(
                    RoundedCornerShape(4.dp)
                )
        )
        Text(
            text = contact.name,
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
            fontSize = 18.sp, color = black2
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewContactList() {
    val contacts = listOf<User>(
        User("123123", "张三", R.drawable.avatar_2),
        User("321321", "李四", R.drawable.avatar_3),
    )
    ContactList(contacts)
}