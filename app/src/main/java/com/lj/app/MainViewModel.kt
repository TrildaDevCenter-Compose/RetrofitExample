package com.lj.app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lj.domain.CommentRepository
import com.lj.domain.CountryService
import com.lj.domain.PostRepository
import com.lj.domain.UserRepository
import com.lj.domain.model.Comment
import com.lj.domain.model.Country
import com.lj.domain.model.Post
import com.lj.domain.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val countryRepo: CountryService,
    private val userRepo: UserRepository,
    private val postRepo: PostRepository,
    private val commentRepo: CommentRepository,

    ) : ViewModel() {

    private var _countries by mutableStateOf(emptyList<Country>())
    val countries: List<Country>
        get() = _countries

    fun searchCountries(query: String) {
        viewModelScope.launch {
            _countries = countryRepo.searchCountries(query)
        }
    }


    private var _users by mutableStateOf(emptyList<User>())
    val users: List<User>
        get() = _users

    fun getUsers() {
        viewModelScope.launch {
            _users = userRepo.getUsers()
        }
    }


    private var _posts by mutableStateOf(emptyList<Post>())
    val posts: List<Post>
        get() = _posts

    fun getPosts() {
        viewModelScope.launch {
            _posts = postRepo.getPosts()
        }
    }


    private var _comments by mutableStateOf(emptyList<Comment>())
    val comments: List<Comment>
        get() = _comments

    fun getComments() {
        viewModelScope.launch {
            _comments = commentRepo.getComments()
        }
    }
}
