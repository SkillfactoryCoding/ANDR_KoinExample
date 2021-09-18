package com.devsoldatenkov.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by viewModel()
    private val someClassWithConstructor: SomeClassWithConstructor by inject { parametersOf("Hello!") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("VVV ${viewModel.getFromRepo()}")
        someClassWithConstructor.emitData()
        SomeClassForInject()
    }
}