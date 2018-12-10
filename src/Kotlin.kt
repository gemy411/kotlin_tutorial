import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    var list1: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    val list2: List<Int> = listOf(1, 2, 3, 4, 5)

    list1.add(6)
    println("1st : ${list1.first()}")
    println("last: ${list1.last()}")

    println("2nd : ${list1[2]}")

    var list3 = list1.subList(0, 3)

    println("length: ${list1.size}")

    list3.clear()
    list1.removeAt(1)
    list1.forEach({n -> println("Multable List : $n")})






}
