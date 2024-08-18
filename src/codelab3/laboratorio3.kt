package codelab3

fun main(args: Array<String>){
    /* Task 2: Learn about operators and types */
    /* Step 1: Explore numeric operators */
    println(1+1)
    println(53-3)
    println(50/10)
    println(1.0/2.0)
    println(2.0*3.5)
    println(6*50)
    println(6.0*50.0)
    println(6.0*50)
    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))

    /* Step 2: Practice using types */
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1
    println(b2)

  /*  val i1: Int = b2
    println(i1)

    val i2: String = b2
    println(i2)

    val i3: Double = b2
    println(i3)                    */

    val i4: Int = b2.toInt()
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    println(oneMillion)

    val socialSecurityNumber = 999_99_9999L
    println(socialSecurityNumber)

    val hexBytes = 0xFF_EC_DE_5E
    println(hexBytes)

    val bytes = 0b11010010_01101001_10010100_10010010
    println(bytes)

    /* Step 3: Learn the value of variable types */

    var fish = 1
    println(fish)
    fish = 2
    println(fish)

    val aquarium = 1
    println(aquarium)
 /*   aquarium = 2
    println(aquarium)   */

    var fish2: Int = 12
    println(fish2)

    var lakes: Double = 2.5
    println(lakes)

    /* Step 4: Learn about strings */

    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish+numberOfPlants} fish and plants")

    /* Task 3: Compare conditions and booleans */

    val numberOfFish2 = 50
    val numberOfPlants2 = 23
    if (numberOfFish2 > numberOfPlants2){
        println("Good ratio")
    } else {
        println("Unhealthy ratio")
    }

    val fish3 = 50
    if (fish3 in 1..100){
        println(fish3)
    }

    if (numberOfFish2 == 0) {
        println("Empty tank")
    } else if (numberOfFish2 < 40){
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    when (numberOfFish2){
        0 -> println("Empty tank")
        in 1..39 -> ("Got a fish!")
        else -> println("That's a lot of fish!")
    }

    /* Task 4: Learn about nullability */
    /* Step 1: Learn about nullability */

    /*  var rocks: Int = null
    println(rocks) */

    var marbles: Int? = null
    println(marbles)

    /* Step 2: Learn about the ? and ?: operators */
    var fishFoodTreats = 6
    if (fishFoodTreats != null){
        fishFoodTreats = fishFoodTreats.dec()
        println(fishFoodTreats)
    }

    var fishFoodTreats2 = 6
    fishFoodTreats2 = fishFoodTreats2?.dec() ?:0
    println("fishFoodTreats2: $fishFoodTreats2")

    /* Task 5: Explore arrays, list, and loops */
    /* Step 1: Make lists */
    val school = listOf("mackerel","trut","halibut")
    println(school)

    val myList = mutableListOf("tuna","salmon","shark")
    println(myList)
    myList.remove("shark")
    println(myList)

    /* Step 2: Create arrays */
    val school2 = arrayOf("shark","salmon","minnow")
    println(java.util.Arrays.toString(school2))

    val mix = arrayOf("fish",2)
    println(mix)

    val numbers = intArrayOf(1,2,3)
    println(numbers)

    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println(foo2[5])

    val numbers4 = intArrayOf(1,2,3)
    val oceans = listOf("Atlantic","Pacific")
    val oddList = listOf(numbers4, oceans,"salmon")
    println(oddList)

    val array = Array(5){
        it * 2
    }
    println(java.util.Arrays.toString(array))

    /* Step 3: Make loops */
    val school3 = arrayOf("shark","salmon","minnow")
   /* for (element in school3){
        print(element + " ") */
    for((index,element) in school3.withIndex()){
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print("$i\n")

    for (i in 5 downTo 1) print(i)

    for (i in 3..6 step 2) print(i)

    for (i in 'd'..'g') print(i)

    var bubbles = 0
    while (bubbles < 50){
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    }   while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2){
        println("A fish is swimming")
    }
}