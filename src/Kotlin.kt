
fun main(args: Array<String>) {

    var nullVall: String? = null

    fun returnNull(): String? {
        return null
    }
    var nullVal2 = returnNull()

    if (nullVal2 != null) {
        println("null val 2 . length ${nullVal2.length}")
    }
    var nullVal3 = nullVal2!!.length
    var nullVal4: String = returnNull() ?: "No name"
}




