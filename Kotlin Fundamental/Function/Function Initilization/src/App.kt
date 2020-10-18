// main function
fun main() {
    val user = setUser("Rizki", 24)
    println(user)

    printUser("Rizki")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) : Unit {
    println("Your name is $name")
}