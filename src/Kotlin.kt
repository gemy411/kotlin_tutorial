import java.util.Random
fun main(args: Array<String>) {

    for (x in 1..100) {
        println("Loop : $x")
    }
    val rand = Random()
    val magicNum = rand.nextInt(50) + 1
    var guess = 0
    while (magicNum != guess) {
        guess += 1

    }
    println("Magic Number was $guess")
    for (x in 1..200) {
        if (x % 2 == 0) {
            continue
        }
        println("Odd : $x")
        if (x == 15 ) break
    }
    var arr3: Array<Int> = arrayOf(3, 6, 9, 7, 5, 4, 3, 5, 7, 8, 87)


    for (i in arr3.indices) {
        println(arr3[i])
    }
    for ((index, value) in arr3.withIndex()) {
        println("Index : $index Value : $value")

    }




}

