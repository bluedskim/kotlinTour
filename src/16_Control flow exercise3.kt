fun main() {
    val oneToHunderd = 1..100;
//    for(number in oneToHunderd) {
//        if(number % 3 == 0 && number % 5 == 0) {
//            println("$number : fizzbuzz")
//        } else if (number % 3 == 0) {
//            println("$number : fizz")
//        } else if (number % 5 == 0) {
//            println("$number : buzz")
//        } else {
//            println("$number")
//        }
//    }

    for(number in oneToHunderd) {
        println(
            when {
                number % 3 == 0 && number % 5 == 0 -> "$number : fizzbuzz"
                number % 3 == 0 -> "$number : fizz"
                number % 5 == 0 -> "$number : buzz"
                else -> number
            }
        )
    }
}
