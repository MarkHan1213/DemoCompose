package com.mark.democompose.ui.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data class Chat(var friend: User, var msgs: MutableList<Msg>) {
}

data class Msg(val from: User, val text: String, val time: String) {
    var read: Boolean by mutableStateOf(true)
}