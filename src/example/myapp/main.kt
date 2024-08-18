package example.myapp

fun buildAquarium(){
    val myAquarium = Aquarium()
  //  val aquarium1 = Aquarium()
    myAquarium.printSize()
  //  myAquarium.height = 60
  //  myAquarium.printSize()

    // default height and length
  //  val aquarium2 = Aquarium(width = 25)
  //  aquarium2.printSize()
    // default width
  //  val aquarium3 = Aquarium(height = 35, length = 110)
  //  aquarium3.printSize()
    // everything custom
  //  val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
  //  aquarium4.printSize()

    /*val aquarium6 = Aquarium(numberOfFish = 29)
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l") */


}

fun main(){
    buildAquarium()
}
