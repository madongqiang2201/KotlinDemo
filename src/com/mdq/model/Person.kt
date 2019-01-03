package com.mdq.model

open class Person(var name: String) {

    open fun printName() {
        println(name)
    }
}