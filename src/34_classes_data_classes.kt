data class User(val name:String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 3)

    println("user == secondUser: ${user == secondUser}")
    println("user == thridUser: ${user == thirdUser}")

    println(user.copy())
    println(user.copy("Max"))

    println(user.copy(id = 3))
}
