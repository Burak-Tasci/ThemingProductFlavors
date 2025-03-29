package com.tsci.theming_with_flavors

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModel(
    private val networkService: NetworkService
): ViewModel() {

    val requestLiveData = MutableLiveData<String>()

    fun sendRequest() {
        val response = networkService.request()
        requestLiveData.postValue(response)
    }

    class MyViewModelFactory(private val service: NetworkService) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return MainViewModel(service) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}