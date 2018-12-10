import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    val map = mutableMapOf<Int, Any?>()

    val map2 = mutableMapOf(1 to "Doug", 2 to 25)

    map[1] = "Derek"
    map[2] = 42

    println("Map size : ${map.size}")

    map.put(3, "pittsss")

//    map.remove(2)

    for ((x, y) in map) {
        println("Key : $x Value : $y ")
    }




}
