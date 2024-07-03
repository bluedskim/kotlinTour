fun main() {
    var neverNull: String  = "This can't be null"
//    neverNull = null;

    var nullable : String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-nullable"
    //inferredNonNull = null

    fun strLength(nonNull: String) : Int {
        return nonNull.length
    }

    println(strLength(neverNull))
//    println(strLength(nullable))
}
