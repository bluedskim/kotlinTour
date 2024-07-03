class Contact(val id:Int, var email:String) {
    fun printlId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "이메일 주소")

    println(contact.email)

    contact.email = "jang@gmail.com"

    println(contact.email)

    contact.printlId()
}
