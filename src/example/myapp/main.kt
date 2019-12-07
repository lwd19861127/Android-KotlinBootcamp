package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

    val myAquarium1 = Aquarium()
    myAquarium1.printSize()

    val myAquarium2 = Aquarium(width = 25)
    myAquarium2.printSize()

    val myAquarium3 = Aquarium(height = 35, length = 110)
    myAquarium3.printSize()

    val myAquarium4 = Aquarium(width = 25, height = 35, length = 110)
    myAquarium4.printSize()

    val myAquarium5 = Aquarium(numberOfFish = 29)
    myAquarium5.printSize()
    myAquarium5.volume = 70
    myAquarium5.printSize()

    val myAquarium6 = Aquarium(length = 25, width = 25, height = 40)
    myAquarium6.printSize()

    val myAquarium7 = Aquarium(width = 25, length = 25, height = 40)
    myAquarium7.printSize()

    val myTower = Aquarium.TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    //buildAquarium()
    makeFish()
}