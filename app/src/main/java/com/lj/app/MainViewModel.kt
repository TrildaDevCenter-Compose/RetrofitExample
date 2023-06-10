package com.lj.app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lj.domain.CountryRepository
import com.lj.domain.model.Country
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: CountryRepository
) : ViewModel() {

    private var _countries by mutableStateOf(emptyList<Country>())

    val countries: List<Country>
        get() = _countries

    fun searchCountries(query: String) {
        viewModelScope.launch {
            _countries = repository.searchCountries(query)
        }
    }
}
