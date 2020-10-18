

data class DataUser(val name : String, val age : Int, val lahir: Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17, 29)

    val name = dataUser.component1()
    val age = dataUser.component2()
    val lahir = dataUser.component3()

    println("My name is $name, I am $age years old, $lahir")
}