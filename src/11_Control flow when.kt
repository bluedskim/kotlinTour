fun main() {
    val obj = "Hello"
    when(obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("unknown")
    }

    val result = when(obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "unknown"
    }
    println("result = $result")

    val temp = 18;
    val description = when {
        temp < 0 -> "very cold"
        temp < 10 -> "a bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
    println(description)
}
