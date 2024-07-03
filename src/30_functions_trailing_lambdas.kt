fun main() {
    // Lambda argument should be moved out of parentheses
    println(listOf(1,2,3).fold(0, {x, item -> x + item}))
    println(listOf(1,2,3).fold(0){x, item -> x + item})
}
