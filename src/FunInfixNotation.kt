infix fun String.to(type: String): String{
    if(type == "UP"){
        return this.toLowerCase()
    } else {
        return this.toLowerCase()
    }
}

fun main(){
    //val result = "Shevabey Rahman" to "UP"
    val result = "Shevabey Rahman" to "LO"
    println(result)
    
}