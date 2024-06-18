fun main() {
    //https://kotlinlang.org/docs/kotlin-tour-collections.html#set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    //You can see in the previous example that because sets only contain unique elements, the duplicate "cherry" item is dropped.
    println("readOnlyFruit=${readOnlyFruit}")

    val fruit : MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    //You can see in the previous example that because sets only contain unique elements, the duplicate "cherry" item is dropped.
    println("fruit=${fruit}")

    //To get the number of items in a set, use the .count() function:
    println("count example fruit.count()=${fruit.count()}")

    //To check that an item is in a set, use the in operator:
    println("check if 'banana' in the set : ${"banana" in readOnlyFruit}")

    //To add or remove items from a mutable set, use .add() and .remove() functions respectively:
    fruit.add("낑깡")
    fruit.remove("banana")
    println("remove banana fruit =${fruit}")

}
