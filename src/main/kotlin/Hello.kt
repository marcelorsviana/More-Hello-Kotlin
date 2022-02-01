import java.util.*

fun randomDay(): String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

/*
assinging the result of a 'when' loop to a val
 */

//fun fishFood(day: String) : String {
//    val food = ""
//    when (day){
//        "Monday" -> food = "flakes"
//        //"Tuesday" -> food = "pellets"
//        "Wednesday" -> food = "redworms"
//        "Thursday" -> food = "granules"
//        "Friday" -> food = "mosquitoes"
//        //"Saturday" -> food = "lettuce"
//        "Sunday" -> food = "plankton"
//        else -> food = "nothing"
//    }
//    return food
//}


/*
The same loop, but more concise.
 */

fun fishFood(day: String) : String {
    return when (day){
        "Monday" -> "flakes"
        //"Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        //"Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

//fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
//    return when {
//        temperature > 30 -> true
//        dirty > 30       -> true
//        day == "Sunday"  -> true
//        else             -> false
//    }
//}

/*
The function below is a version the above one, but with compact functions inside it, instead.
 */

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty)        -> true
        isSunday(day)         -> true
        else                  -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun main() {

    feedTheFish()
    swim()                      // default speed
    swim("slow")          // positional argument
    swim(speed="turtle-like")   // named parameter


}
