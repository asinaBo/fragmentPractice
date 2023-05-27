package com.example.neco2app567fragmenttabpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val plant = MutableLiveData<PlantModel>()
}