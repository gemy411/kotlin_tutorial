fun main(args: Array<String>) {

   val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach{n -> println(n) }

    val mult3 = makeMathFunc(3)
    mult3(5)
    println(mult3(3))

    val multiply2 = {num1: Int -> num1 * 2}
//    fun multiplyBy2(number: Int): Int {
//        return number * 2
//    }
    val numList2 = arrayOf(1, 2, 3, 4, 5)
    mathOnList(numList2, multiply2)
    mathOnList(numList2) {
       it * 2
    }

    val arrayOfNumbers = arrayOf(0, 12, 0, 1, 5, 0, 3, 0)
    operations(arrayOfNumbers,{ it1:Int , it2: Int ->
            println("success $it1 and $it2")

    },{
        println("Failure $it")
    })




}
fun makeMathFunc (num1: Int): (Int) -> Int = {num2 -> num1 * num2}
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
 for (num in numList) {
  println("mathONList ${myFunc(num)}")

 }
}
fun operations(numbers: Array<Int>, onSuccess: (num: Int, num2 : Int) -> Unit, onFailure: (num: Int) -> Unit) {
    for (num in numbers) {
        if (num == 0) {
            onFailure(num)
        }else{
            onSuccess(num,10)
        }

    }
}
