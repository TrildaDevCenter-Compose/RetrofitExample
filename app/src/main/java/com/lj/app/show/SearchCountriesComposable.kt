package com.lj.app.show

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import com.lj.app.MainViewModel
import com.lj.app.common.SearchFieldComposable

@Composable
fun SearchCountriesComposable() {

    val viewModel = hiltViewModel<MainViewModel>()
    var searchText by remember { mutableStateOf("") }


    Column {
//        Column {
//            SearchFieldComposable(searchText, onSearchTextChange = { newText ->
//                searchText = newText
//                viewModel.searchCountries(searchText)
//            })
//            CountryList(countries = viewModel.countries)
//        }

        Column {
            SearchFieldComposable(searchText, onSearchTextChange = { newText ->
                searchText = newText
                viewModel.getPosts()
                viewModel.getComments()
                viewModel.getUsers()


            })
            PostList(posts = viewModel.posts)
        }
    }
}