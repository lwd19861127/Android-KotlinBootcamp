package example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}

interface FishAction  {
    fun eat()
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

class Shark: FishColor, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishColor by GoldColor, FishAction by PrintingFishAction("eat algae") {
}

sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

fun main() {
    println(matchSeal(SeaLion()))
}