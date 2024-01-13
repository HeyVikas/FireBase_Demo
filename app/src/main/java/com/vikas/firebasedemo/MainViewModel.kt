package com.vikas.firebasedemo

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val counter = mutableStateOf(0)
    val fireBaseRepo = FireBaseRepo()

    fun count(){
        fireBaseRepo.Count()
    }
}