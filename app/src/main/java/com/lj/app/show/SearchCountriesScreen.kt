package com.lj.app.show

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import com.lj.app.MainViewModel
import com.lj.app.common.SearchFieldComposable

@Composable
fun SearchCountriesScreen(viewModel: MainViewModel) {

    var searchText by remember { mutableStateOf("") }
    val items = viewModel.countries

    Column {
            SearchFieldComposable(searchText, onSearchTextChange = { newText ->
                searchText = newText
                viewModel.searchCountries(searchText)
            })
            CountryList(countries = items)
    }
}