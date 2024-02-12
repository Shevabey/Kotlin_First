fun main() {

//    Underscore In Number
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L
    println(age)
//    Floating point number
    var sample: Float = 10.10F
    println(sample)

//    Literals
    var binary: Int = 0b010101010
    println(binary)

//    Underscore in number
    var price: Long = 9_000_000_000L
    println(price)

//    Conversion
    var priceInt: Int = price.toInt()
    println(priceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)

}