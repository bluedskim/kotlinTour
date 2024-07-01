fun printMesageWithPrefix(message:String, prefix:String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    printMesageWithPrefix("Hello", "Log")
    printMesageWithPrefix("Hello")
    printMesageWithPrefix(prefix="Log", message="Hello")
}
