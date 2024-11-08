package com.capstone.gagambrawl.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    // LiveData to observe login status
    private val _loginStatus = MutableLiveData<Boolean>()
    val loginStatus: LiveData<Boolean> get() = _loginStatus

    // LiveData for error messages
    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    fun login(username: String, password: String) {


            // For this example, we'll just use a mock check
            if (username == "testuser" && password == "password") {
                _loginStatus.value = true
            } else {
                _loginStatus.value = false
                _errorMessage.value = "Invalid username or password"
            }
        }

    fun resetErrorMessage() {
        _errorMessage.value = ""
    }
}