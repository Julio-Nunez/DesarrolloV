package example.myapp

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 31){

    val volume: Int
        get() = width * height * length / 1000     //1000cm3 = 1 l

    fun printSize(){
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        //
        println("Volume: $volume l")
    }

    init {
        println("aquarium initializing")
    }


    /* init {
        // 1 liter = 1000 cm3
        println("Volume: ${width * length * height / 1000 } l")
    }     */

    /*init {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    } */

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

}

