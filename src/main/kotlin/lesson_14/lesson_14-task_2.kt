package lesson_14

/** Created by Platon2025 */

fun main() {
    val shipSpeed: Map<String, Int> = mapOf(Pair("standard", 24), Pair("cargo", 20), Pair("iceBreaker", 18))
    val shipCapacity: Map<String, Int> = mapOf(Pair("standard", 120), Pair("cargo", 240), Pair("iceBreaker", 80))

    val cargoShip = cargoShip2("Джамбо", shipCapacity["cargo"]!!, shipSpeed["cargo"]!!, "сухогруз")
    val iceBreaker = iceBreaker2("Ленин", shipCapacity["iceBreaker"]!!, shipSpeed["iceBreaker"]!!, 3)

    cargoShip.showSpeed()
    cargoShip.showCapacity()
    cargoShip.showCargoType()
    cargoShip.getUnderLoading()
    cargoShip.exitLoading()
    println()
    iceBreaker.showSpeed()
    iceBreaker.showCapacity()
    iceBreaker.assessIcePermeability(3)
    iceBreaker.assessIcePermeability(4)
}

open class Ship2(
    val name: String,
    val capacity: Int,
    val speed: Int,
) {
    fun showSpeed() {
        println("Скорость корабля \"$name\" - $speed узлов")
    }

    fun showCapacity() {
        println("Грузоподьемность корабля \"$name\" - $capacity контейнеров")
    }
}


class cargoShip2(
    name: String,
    capacity: Int,
    speed: Int,
    val cargoType: String,
) : Ship2(name, capacity, speed) {
    fun getUnderLoading() {
        println("Корабль \"$name\" встал под загрузку")
    }

    fun exitLoading() {
        println("Корабль \"$name\" вышел из под загрузки")
    }

    fun showCargoType() {
        println("Тип корабля \"$name\" - $cargoType")
    }
}

class iceBreaker2(
    name: String,
    capacity: Int,
    speed: Int,
    val maxIceThickness: Int,
) : Ship2(name, capacity, speed) {
    fun assessIcePermeability(iceThickness: Int) {
        if (iceThickness <= this.maxIceThickness) println("Лёд толщиной $iceThickness является проходимым для корабля \"$name\"")
        else println("Лёд толщиной $iceThickness является непроходимым для корабля \"$name\"")
    }
}