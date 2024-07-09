fun lengthString(maybeString:String?) : Int? = maybeString?.length

fun main() {
    val nullString: String? = null
    println(lengthString(nullString))
    // The safe call operator can also be used to safely call an extension or member function
    println(nullString?.uppercase())

    //use elvis operator
    println(nullString?.length ?: 0)
}
