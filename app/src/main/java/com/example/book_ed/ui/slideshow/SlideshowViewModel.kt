package com.example.book_ed.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the New Arrivals or maybe bestselling? or popular near you?" +
                "P.S. need to make new fragment for Profile->BOOKS section"
    }
    val text: LiveData<String> = _text
}