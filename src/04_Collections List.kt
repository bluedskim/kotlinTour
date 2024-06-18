fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

//    val cannot be reassigned
//    shapes = mutableListOf("triangle", "square", "circle")

    // casting
    val shapeLocked : List<String> = shapes

    println("The first item in the list is : ${shapeLocked[0]}")
    println("The first item in the list is : ${shapeLocked.first()}")
    println("The last item in the list is : ${shapeLocked.last()}")
    println("This list has ${shapeLocked.count()} items")
    println("circle in shapes? ${"circle" in shapes}")

    //To add or remove items from a mutable list, use .add() and .remove() functions respectively:
    shapes.add("pentagon")
    println("add 'pentagon' to shape = ${shapes}")
    shapes.remove("pentagon")
    println("remove 'pentagon' to shape = ${shapes}")
}
