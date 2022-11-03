package com.project.lab_2.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoriesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Categories"
    }
    val text: LiveData<String> = _text
}