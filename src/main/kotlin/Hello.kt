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
}

fun main() {

    feedTheFish()

}
