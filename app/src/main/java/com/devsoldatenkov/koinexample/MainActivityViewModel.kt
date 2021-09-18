package com.devsoldatenkov.koinexample

import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val repo: Repo) : ViewModel() {
    fun getFromRepo() = repo.getSmth()
}