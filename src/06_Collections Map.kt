fun main() {
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    val juiceMenu : MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    juiceMenu.put("coconut", 200)
    juiceMenu.remove("apple")
    println(juiceMenu.contains("apple"))

    println("juiceMenu keys: ${juiceMenu.keys}")
    println("juiceMenu values: ${juiceMenu.values}")

    println("apple" in juiceMenu.keys)
    println(111 in juiceMenu.values)
}
