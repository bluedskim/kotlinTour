fun main() {
    var customers = 10
    customers = 8
    customers = customers + 3;
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3
    println(customers)

    //To declare a variable without initializing it, specify its type with :
    val d : Int
    d = 3

    val e : String = "hello"
    println(d)
    println(e)

    //Explicitly declare the correct type for each variable:
    val a : Int = 10_00
    println("a=$a")
    val b : String = "log message"
    val c : Double = 3.14
    var f : Long = 1234567890
    println("f=$f")
    f = 1_0;
    println("f=$f")
    f = 4444_333_22_1;
    println("f=$f")
    f = 1
    val g : Float = 1f;
    println("g=$g")
    val h : Boolean = false
    val i : Char = '\n'


}
