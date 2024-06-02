package com.victor.mvvmdemoapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // Private mutable LiveData to hold the data
    private val _data = MutableLiveData<String>()

    // Public immutable LiveData to expose the data
    val data: LiveData<String>
        get() = _data

    // Function to update the data
    fun updateData(newData: String) {
        _data.value = newData
    }
}
