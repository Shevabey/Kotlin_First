fun main() {
    fun Hello(name: String = ""): String{
        return when(name){
            "" -> "Hello Bro"
            else -> "hello $name"
        }

//        return if (name == ""){
//            "hello Bro"
//        }else{
//            "hello $name"
//        }
    }

    println(Hello())
    println(Hello("Rahman"))
}