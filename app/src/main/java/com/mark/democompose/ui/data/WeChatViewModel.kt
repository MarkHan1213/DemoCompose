package com.mark.democompose.ui.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.mark.democompose.R

class WeChatViewModel : ViewModel() {

    var chats by mutableStateOf(
        listOf(
            Chat(
                friend = User("A0001", "张三", R.drawable.avatar_2),
                mutableStateListOf(
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06").apply {
                        read = false
                    },
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06").apply {
                        read = false
                    },
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0001", "张三", R.drawable.avatar_2),
                mutableStateListOf(
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06").apply {
                        read = false
                    },
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06").apply {
                        read = false
                    },
                )
            ),
            Chat(
                friend = User("A0001", "张三", R.drawable.avatar_2),
                mutableStateListOf(
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0001", "张三", R.drawable.avatar_2),
                mutableStateListOf(
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06").apply {
                        read = false
                    },
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0001", "张三", R.drawable.avatar_2),
                mutableStateListOf(
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0001", "张三", R.drawable.avatar_2),
                mutableStateListOf(
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0001", "张三", R.drawable.avatar_2), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
            Chat(
                friend = User("A0002", "李四", R.drawable.avatar_3),
                mutableStateListOf(
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:00"),
                    Msg(User.Me, "你好", "16:01"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:02"),
                    Msg(User.Me, "你好", "16:03"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:04"),
                    Msg(User.Me, "你好", "16:05"),
                    Msg(User("A0002", "李四", R.drawable.avatar_3), "你好", "16:06"),
                    Msg(User.Me, "你好", "16:07"),
                )
            ),
        )
    )

    var selectedIndex by mutableStateOf(0)


    val contacts by mutableStateOf(
        listOf(
            User("123123", "张三", R.drawable.avatar_2),
            User("321312", "李四", R.drawable.avatar_3)
        )
    )
}