import kotlin.random.Random

data class Employee2(val name: String, var salary: Int)
class RandomEmployeeGenerator(var minSalary:Int, var maxSalary:Int){
    fun generateEmployee(): Employee2 {
        val salary : Int = Random.nextInt(minSalary, maxSalary);
        val nameIdx : Int = Random.nextInt(0, names.size);
        return Employee2(names[nameIdx], salary)
    }

    val names = listOf("name1", "name2", "name3")
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
