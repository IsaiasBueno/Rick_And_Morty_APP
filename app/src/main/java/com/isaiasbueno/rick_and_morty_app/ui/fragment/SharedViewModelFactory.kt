package com.isaiasbueno.rick_and_morty_app.ui.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.isaiasbueno.rick_and_morty_app.api.Repository

class SharedViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SharedViewModel(repository) as T
    }
}