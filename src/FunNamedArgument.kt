fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Sheva", "Bey", "Rahman")
    fullName(
        lastName = "Rahman",
        firstName = "Bey",
        middleName = "Sheva"
    )
}