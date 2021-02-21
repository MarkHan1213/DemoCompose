package com.mark.democompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticAmbientOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientAnimationClock
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.viewModel
import com.mark.democompose.ui.ContactList
import com.mark.democompose.ui.chatListPage
import com.mark.democompose.ui.data.WeChatViewModel
import com.mark.democompose.ui.theme.DemoComposeTheme
import com.mark.democompose.ui.wiget.Pager
import com.mark.democompose.ui.wiget.PagerState
import com.mark.democompose.ui.wiget.weChatBottomBar

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: WeChatViewModel = viewModel()
            DemoComposeTheme {
                Column() {
                    val pagerState: PagerState = run {
                        val clock = AmbientAnimationClock.current
                        remember(clock) { PagerState(clock = clock, maxPage = 3) }
                    }
                    Pager(state = pagerState, Modifier.weight(1f)) {
                        when (page) {
                            0 -> chatListPage(viewModel.chats)
                            1 -> ContactList()
                            2 -> Box(modifier = Modifier.fillMaxSize())
                            3 -> Box(modifier = Modifier.fillMaxSize())
                        }
                    }
                    weChatBottomBar(pagerState.currentPage) {
                        pagerState.currentPage = it
                    }
                }
            }
        }
    }

}


fun Modifier.unread(read: Boolean) = this.drawWithContent {
    drawContent()
    if (!read) {
        drawCircle(
            color = Color.Red,
            radius = 5.dp.toPx(),
            center = Offset(size.width - 1.dp.toPx(), 1.dp.toPx())
        )
    }
}
