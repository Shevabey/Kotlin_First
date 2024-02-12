//Variable Global
const val APP = "Kotlin"
const val Version = "0.0.1"

fun main() {
    val firstname = "Shevabey"
    val age = 20

    println(firstname)
    println(age)

//    Nullable
    var name: String? = null
    name = "sheva"
    println(name)
    println(name?.length)

    println("$APP : $Version")
}