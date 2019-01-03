package com.mdq.model

class User(var name: String) {

    private var desc: String? = null

    init {
        name = "mdq"
    }

    constructor(name: String, desc: String) : this(name) {
        this.desc = desc
    }

    fun sayHi() {
        println("Hi, $name")
    }
}