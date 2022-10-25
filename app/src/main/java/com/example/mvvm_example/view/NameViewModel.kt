package com.example.mvvm_example.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    private val _name: MutableLiveData<String> = MutableLiveData<String>()
    val name: LiveData<String> = _name

    fun getName(inputName: String) {
        _name.value = inputName
    }
}