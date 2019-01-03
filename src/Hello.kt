import com.mdq.model.Person

fun main(args: Array<String>) {
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
}

fun case(obj: Any) {
    when(obj) {
        1 -> println("obj is $obj")
        "hello" -> println("obj is $obj")
        is Long -> println("obj is Long Type")
        !is String -> println("obj is not a String")
        else -> println("other condition")
    }
}