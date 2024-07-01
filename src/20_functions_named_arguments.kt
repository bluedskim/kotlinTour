fun printMessagePrerfix(message:String, prefix:String) {
    println("[$prefix] $message")
}

fun main () {
    printMessagePrerfix(prefix="Log", message="Hello")
}
