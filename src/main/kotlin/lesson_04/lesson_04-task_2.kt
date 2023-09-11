package lesson_04

/** Created by Platon2025 */

fun main() {

    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100
    var cargoWeight: Int
    var cargoVolume: Int

    cargoWeight = 20
    cargoVolume = 80
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${cargoWeight >= minWeight && cargoWeight <= maxWeight && cargoVolume <= maxVolume}")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${cargoWeight >= minWeight && cargoWeight <= maxWeight && cargoVolume <= maxVolume}")
}