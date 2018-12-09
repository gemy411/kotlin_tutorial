fun main(args: Array<String>) {

    fun add(num1: Int, num2: Int): Int = num1 + num2

    println("5 + 4 = ${add(5, 4)}")

    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("9-5 = ${subtract(9, 5)}")
    println("9 + 11 = ${add(num2 = 11, num1 = 9)}")

    fun sayHello(name: String): Unit = println("Hello $name")
    sayHello("dude")

    val (two, three) = nextTwo(1)
    println("1 $two $three")

    println("Sum = ${getSum(1,2,3,4,5)}")

    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5,3)}")

    println("! = ${factorial2(122)}")



}

fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

fun getSum(vararg nums: Int): Int {
    var sum = 0 
    nums.forEach { n -> sum += n }
    return sum
}

fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z

        else return factTail(y - 1, y * z)

    }
    return factTail(x, 1)

}

fun factorial2(x: Int): Int {
    if (x == 0) return 1

    return x * factorial2(x - 1)

}
