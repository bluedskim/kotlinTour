fun main() {
    // Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed to output.
    val button = "A"
    println(
        when(button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}
