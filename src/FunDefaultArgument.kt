fun hello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Sheva")
    hello("bey")
    hello("Rahman", "yaa")
}