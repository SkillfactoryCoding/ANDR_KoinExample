package com.devsoldatenkov.koinexample

class SomeClassWithConstructor(private val data: String) {
    fun emitData() {
        println("VVV $data")
    }
}