package com.lj.app.show

import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.lj.app.MainViewModel

@Composable
fun SearchCountriesRoute() {

    val viewModel = hiltViewModel<MainViewModel>()

    SearchCountriesScreen(viewModel = viewModel)
}