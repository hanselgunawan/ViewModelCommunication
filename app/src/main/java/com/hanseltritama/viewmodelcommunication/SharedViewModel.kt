package com.hanseltritama.viewmodelcommunication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    private val myStr: MutableLiveData<String> = MutableLiveData()

    fun setText(input: String) {
         myStr.value = input
    }

    fun getText(): LiveData<String> {
        return myStr
    }

}