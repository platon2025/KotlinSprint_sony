package lesson_14

/** Created by Platon2025 */

fun main() {

    val planet = Planet(
        "Татуин", true, true, true, true,
        listOf(
            Satellite("Гомрассен", true, false, false, true, "Татуин"),
            Satellite("Гермесса", false, false, false, true, "Татуин")
        )
    )

    println("Планета ${planet.name} имеет ${planet.satellitesList.size} спутника")

    planet.satellitesList.forEach {
        println("${it.name} является спутником планеты ${it.parentPlanet}")
    }

}

open class Celestial(
    val name: String,
    val isHabitable: Boolean,
    val hasAutmosphere: Boolean,
    val hasWater: Boolean,
    val isLandable: Boolean,
)

class Planet(
    name: String,
    isHabitable: Boolean,
    hasAutmosphere: Boolean,
    hasWater: Boolean,
    isLandable: Boolean,
    val satellitesList: List<Satellite>,
) : Celestial(name, isHabitable, hasAutmosphere, hasWater, isLandable)

class Satellite(
    name: String,
    isHabitable: Boolean,
    hasAutmosphere: Boolean,
    hasWater: Boolean,
    isLandable: Boolean,
    val parentPlanet: String,
) : Celestial(name, isHabitable, hasAutmosphere, hasWater, isLandable)


