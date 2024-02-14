fun main() {
     var array = arrayOf("Sheva", "Bey", "Rahman")
    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("Total perulangan = $total")

    //for (i in 1..100 step 2)
    for (i in 100 downTo 10 )
        println(i)

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("Index $i - ${ array.get(i) }")
    }
}
