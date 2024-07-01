/**
 * https://kotlinlang.org/docs/kotlin-tour-functions.html#return-from-a-function
 */
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> {value -> value * 60 * 60}
    "minute" -> {value -> value * 60}
    "sende" -> {value -> value}
    else -> {value -> value}
}

fun main() {
    val timesInMinutes = listOf(2,10,15,1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("totalTimeInSeconds=$totalTimeInSeconds")
}
