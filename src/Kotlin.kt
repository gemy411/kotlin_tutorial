fun main(args: Array<String>) {


    val age = 8
    if (age < 5) {
        println("ok")
    }else {
        println("shit")
    }
    when (age) {
        0, 1, 2, 3, 4 -> println("when age")
        5 -> println("hsit")
        in 6..17 -> {
            val grade = age - 5
            println("go to grade $grade")
        }
        else -> println("go home")


    }
}
