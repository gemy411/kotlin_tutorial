fun main(args: Array<String>) {
    var string = " this is a string "
    println("Index form 1 to 7 : ${string.subSequence(1, 7)}")
    println("3rd Index : ${string[3]}")
    println("Contains this : ${string.contains("this")}")
}