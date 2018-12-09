fun main(args: Array<String>) {

    val onetoten = 1..10
    val alpha = "A".."Z"
    println("R in alpha ? : ${"R" in alpha}")
    val tento1 = 10.downTo(1)
    val twoto20 = 2.rangeTo(20)
    val rng3 = onetoten.step(3)
    for (x in rng3) {
        println("rang3 : $x")

    }
    println(tento1 + twoto20)
    if (11 in tento1) {
        println("yes 2 is in tento1")
    } else {
        println("no is not !!")
    }
    for(x in tento1.reversed()) println("Reverse : $x")



}