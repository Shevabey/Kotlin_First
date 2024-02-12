fun main() {
    var names: Array<String> = arrayOf("bey", "Raka", "Boby")
    //names.set(0, "Bey")
    names[0] = "Bey"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])


//    Boleh null
    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Rahman"
    members[1] = "Rahman"
    members[2] = "Rahman"
    members[3] = "Rahman"
    members[4] = "Rahman"
    println(members[0])


}