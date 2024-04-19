package com.lj.app.show

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import com.lj.app.MainViewModel

@Composable
fun MainViewScreen(viewModel: MainViewModel) {
    var searchText by remember { mutableStateOf("") }
    val items = viewModel.posts

    Column {
        PostList(posts = viewModel.posts)
    }
}