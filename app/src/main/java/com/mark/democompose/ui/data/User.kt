package com.mark.democompose.ui.data

import androidx.annotation.DrawableRes
import com.mark.democompose.R

data class User(
  val id: String,
  val name: String,
  @DrawableRes val avatar: Int
) {
    companion object {
        val Me: User = User("MarkHan", "韩智博", R.drawable.avatar_1)
    }
}