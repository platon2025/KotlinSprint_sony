package lesson_04

/** Created by Platon2025 */

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100
fun main() {

    var cargoWeight: Int
    var cargoVolume: Int

    cargoWeight = 20
    cargoVolume = 80
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${cargoWeight >= MIN_WEIGHT && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME}")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${cargoWeight >= MIN_WEIGHT && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME}")
}