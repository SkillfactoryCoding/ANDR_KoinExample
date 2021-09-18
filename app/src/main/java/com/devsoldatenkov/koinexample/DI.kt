package com.devsoldatenkov.koinexample

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

object DI {
    private const val REPO_A = "A"
    private const val REPO_B = "B"
    fun getModule() = module {
        single<Repo>(qualifier = named(REPO_A)) { RepoImplA() }
        single<Repo>(qualifier = named(REPO_B)) { RepoImplB() }
        single { (data: String) -> SomeClassWithConstructor(data) }
        viewModel { MainActivityViewModel(repo = get(named(REPO_A))) }
    }
}