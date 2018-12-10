
fun main(args: Array<String>) {
    val bowswer = Animal("Bowswer", 20.0, 13.5)
    bowswer.getInfo()

}

open class Animal(val name: String,
                  var height: Double,
                  var weight: Double) {
    init {
        val regex = Regex(".*\\d+.*")

        require(!name.matches(regex)) {
            "Animal name can't contaion numbers"
        }
        require(height > 0){
            "Height must be greater than 0"
        }
        require(weight > 0){
            "Height must be greater than 0"
        }

    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}


