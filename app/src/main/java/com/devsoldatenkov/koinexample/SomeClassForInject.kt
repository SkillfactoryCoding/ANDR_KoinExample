package com.devsoldatenkov.koinexample

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.parameter.parametersOf

class SomeClassForInject : KoinComponent {
    private val someClassWithConstructor: SomeClassWithConstructor by inject { parametersOf("Aloha!") }

    init {
        someClassWithConstructor.emitData()
    }
}