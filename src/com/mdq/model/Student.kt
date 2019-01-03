package com.mdq.model

class Student: Person("june") {

    override fun printName() {
        super.printName()
        println("Student $name")
    }
}