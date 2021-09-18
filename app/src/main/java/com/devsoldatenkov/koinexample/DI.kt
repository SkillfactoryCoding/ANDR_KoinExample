package com.devsoldatenkov.koinexample

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object DI {
    fun getModule() = module {
        single<Repo> { RepoImpl() }
        viewModel { MainActivityViewModel(repo = get()) }
    }
}