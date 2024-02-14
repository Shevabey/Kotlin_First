fun main() {

    //When Expression
    var nilai = "A"
    when(nilai) {
        "A" -> {
            println("Amazing")
        }"B" -> {
            println("Good")
        }"C" -> {
            println("Not Bad")
        }"D" -> {
            println("Sad")
        }else -> {
            println("oohh sorry")
        }
    }

    //When Expression Multiple Option
    when(nilai){
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, Anda Tidak Lulus")
        }
    }

    //When Expression In
    nilai= "E"
    val nilaiLulus:Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Anda Lulus")
        !in nilaiLulus -> println("Maaf, Anda Tidak Lulus")
    }

    //When Expression Is
    val name = "Bey"
    when(name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    //When Tanda Variable 
    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang aja")
    }
}