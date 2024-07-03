//https://kotlinlang.org/docs/kotlin-tour-functions.html#lambdas-exercise-2

fun repeatN(n: Int, action: () -> Unit) {
    // Write your code here
    repeat(n) {
        action();
    }
}

fun main() {
    // Write your code here
    repeatN(5, { println("hello") })
}
