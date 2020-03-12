package com.example.book_ed.ui.Friend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FriendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Friend Fragment"
    }
    val text: LiveData<String> = _text
}