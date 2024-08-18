package codelab4
import java.util.*

/*fun main(args: Array<String>){
    /* Task 2: Explore the main() function */
    fun printHello(){
        println("Hello World")
    }
    printHello()

 /*   println("Hello, ${args[0]}")    */

    /* Task 3: Learn why (almost) everything has a value */
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature2 = 10
    val isHot = if (temperature2 > 50) true else false
    println(isHot)

    val temperature = 10
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}"
    println(message)
    }    */

    /* Task 4: Learn more about functions */
    /* Step 1: Create some functions */


    /*fun main(args: Array<String>){
        feedTheFish()
        shouldChangeWater("Sunday", temperature = 15, dirty = 10)
    }
        fun randomDay() : String {
            val week = arrayOf("monday","tuesday","wednestay","thursday","friday","saturday","sunday")
            return week[Random().nextInt(week.size)]
        }

     /*   fun feedTheFish(){
            val day = randomDay()
            val food = "pellets"
            println("Today is $day and the fish eat $food")
        } */

 /*   fun fishFood (day : String) : String {
        var food = ""
        when (day) {
            "monday" -> food = "flakes"
            "tuesday" -> food = "pellets"
            "wednestay" -> food = "redworms"
            "thursday" -> food = "granules"
            "friday" -> food = "mosquitoes"
            "saturday" -> food = "lettuce"
            "sunday" -> food = "plankton"
        }
        return food
    }        */

    fun feedTheFish(){
        val day = randomDay()
        val food = fishFood(day)

        println("Today is $day and the fish eat $food")
    }

/*    fun fishFood (day : String) : String {
        val food : String
        when (day) {
            "monday" -> food = "flakes"
            "wednesday" -> food = "redworms"
            "thursday" -> food = "granules"
            "friday" -> food = "mosquitoes"
            "sunday" -> food = "plankton"
            else -> food = "nothing"
        }
        return food
    }                 */

    fun fishFood (day : String) : String {
        return when (day) {
            "monday" -> "flakes"
            "wednesday" -> "redworms"
            "thursday" -> "granules"
            "friday" -> "mosquitoes"
            "sunday" -> "plankton"
            else -> "nothing"
        }
    }

    fun isToohot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"

    fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
        return when {
            isToohot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else -> false
        }
    }
        */


