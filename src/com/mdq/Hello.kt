package com.mdq

import com.mdq.collection.BaseA
import com.mdq.collection.BaseB
import com.mdq.collection.BaseC
import com.mdq.delegate.Cat
import com.mdq.delegate.Dog
import com.mdq.ext.rename
import com.mdq.model.Person
import com.mdq.model.Student


var person: Person? = null

fun main(args: Array<String>) {

    if (person is Student) {
        (person as Student).printName()
    }

    Cat(Dog()).bark()

    for (i in 1.rangeTo(100) step 20) {
        print("$i,")
    }

    println("hello kotlin")
    Person("mdq").printName()

    val list = arrayListOf(1, 2, 3, 4, 5)

    println(list.map { element -> element * 2 }.filter { element -> element % 3 == 0 })

    var quantity = 5
    val price: Double = 20.3
    val name: String = "大米"

    println("单价$price")
    println("数量$quantity")
    println("名称$name")

    val array = Array(10) {1}
    array[1] = 10

    val x: Int = 10
    val y: Int = 100
    if (x in 1..y) {
        println("x in 1..y")
    }

    if (x !in 0..array.lastIndex) {
        println("x !in 0..${array.lastIndex}")
    }

    for (z in 1..5) {
        print("$z,")
    }

    println()

    for (item in array) {
        print("$item,")
    }

    println()

    case(1)
    case("hello")
    case(10L)
    case('a')

//    val data: Int? = null
    val data: Int? = 10
    println(data?.toBigDecimal())
    println(data?: getStringLength(1))
    println(getIntValue(999))
    println(say("hello"))
    println(sayHello())
    println(sayHello("你好"))

    println(hasEmpty("", "10", "Hello"))

    val person = Person("mdq")
    person.rename("qdm")
    person.printName()

    println(
        reverse("abc",
            {
                println("body content")
                it.reversed()
            },
            { "suffix" })
    )

    val firstName: String? = ""
    firstName?.let {  }

    com.mdq.util.Utils.isEmpty("")
    people()

    test

    {x: Int, y: Int ->
        println("${x + y}")
    }(3, 5)

    printTest.invoke("hello printTest")
    printTest("hello printTest again")

    log("printLog") { println(it) }

    val mutableList: MutableList<BaseB> = mutableListOf(BaseB(), BaseB(), BaseC())
    val lista: List<BaseA> = mutableList
    lista.any { it == BaseA() }
}

val log = { str: String, printLog: (String) -> Unit ->
    people()
    printLog(str)
}

val printTest = { msg: String ->
    println(msg)
}

// 不管在 Main 方法中是否调用，都会在初始化时，打印 yes，且打印在顶部(还没执行 main 之前就打印了)
val test = if (5 > 3) {
    println("yes")
} else{
    println("no")
}

/**
 * 嵌套函数，用于可能出现递归的情况或者不希望外部函数的同级函数访问到的情况，一般不推荐使用
 */
fun people() {
    val str = "hello"

    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }
    say()
}

fun emptyMethod(str: String) = Unit

fun case(obj: Any) {
    when(obj) {
        1 -> println("obj is $obj")
        "hello" -> println("obj is $obj")
        is Long -> println("obj is Long Type")
        !is String -> println("obj is not a String")
        else -> println("other condition")
    }
}

fun getStringLength(obj: Any): Int {
    if (obj is String) {
        return obj.length
    }
    return -1
}

// 编译器可推断返回类型时，可以省略返回类型
fun getIntValue(a: Int) = a
fun say(word: String) : String = word
fun sayHello(word: String = "hello") = word

// 可变参数
fun hasEmpty(vararg arr: String?) : Boolean {
    for (element in arr) {
        if (element == null || "" == element) {
            return true
        }
    }

    return false
}


fun reverse(content: String, body: (content: String) -> String, suffix: () -> String) : String {
    return "${body(content)}${suffix()}"
}















