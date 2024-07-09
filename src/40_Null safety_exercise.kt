data class Employee1 (val name: String, var salary:Int)

fun emplyeeById(id: Int) = when(id) {
    1 -> Employee1("Marry", 20)
    2 -> null
    3 -> Employee1("John", 21)
    4 -> Employee1("Ann", 23)
    else -> null
}

fun salaryById(id:Int) : Int {
//    val employee = emplyeeById(id);
//    if(employee == null)
//        return 0
//    else
//        return employee.salary
    return emplyeeById(id)?.salary ?: 0
}

fun main() {
    println((1..5).sumOf{ id -> salaryById(id) })
}
