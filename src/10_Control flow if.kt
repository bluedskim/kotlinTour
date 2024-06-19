fun main() {
    val d: Int
    val check : Boolean = true

    if(check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    val a : Int = 1
    val b : Int = 2

    print(if(a > b) a else b)
}
