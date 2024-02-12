fun main() {
    var firstName: String = "Shevabey"
    var lastName: String = "Rahman"

    var fullName: String = "$firstName $lastName"
    var desc: String = "nama panjang $fullName panjang = ${fullName.length}"
    var address: String = """ 
        Jalan belum jadi, RT01 RW01
        Kabupaten sleman
        Yogyakarta
        Indonesia
    """.trimIndent()
    println(firstName)
    println(lastName)
    println(desc)
    println(fullName)
    println(address)
}