package com.mdq.ext

import com.mdq.model.Person

fun Person.rename(newName: String = "newName") {
    name = newName
}