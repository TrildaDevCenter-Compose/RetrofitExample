package com.lj.app.show

import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.lj.app.MainViewModel

@Composable
fun MainViewRoute() {
    val viewModel = hiltViewModel<MainViewModel>()

    MainViewScreen(viewModel)
}