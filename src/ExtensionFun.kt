fun String.hello():String = "Hello $this"

fun String.prinHello(): Unit = println("Hello $this")

fun main() {
    val name = "Sheva"
    println(name.hello())

    name.prinHello()
    "bey Rahman".prinHello()
}