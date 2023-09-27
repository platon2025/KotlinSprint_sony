package lesson_14

/** Created by Platon2025 */

fun main() {
    val ship = StandardShip()
    ship.showSpeed()
    ship.showCapacity()
}

class StandardShip(
    val type: String = "Стандартный",
    val capacity: Int = 120,
    val speed: Int = 24,
) {
    fun showSpeed() {
        println("Скорость корабля $type - $speed узлов")
    }

    fun showCapacity() {
        println("Грузоподьемность корабля $type - $capacity ящиков")
    }
}