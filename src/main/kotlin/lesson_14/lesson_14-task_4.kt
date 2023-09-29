package lesson_14

/** Created by Platon2025 */

fun main() {
    val body1 = Planet("Татуин", true, true, true, true, listOf("Гомрассен", "Гермесса"))
    val body2 = Satellite("Гомрассен", true, false, false, true, "Татуин")
    val body3 = Satellite("Гермесса", false, false, false, true, "Татуин")

    println("Планета ${body1.name} имеет ${body1.satellitesList.size} спутника")
    println("${body2.name} является спутником планеты ${body2.parentPlanet}")
    println("${body3.name} является спутником планеты ${body3.parentPlanet}")

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
    val satellitesList: List<String>,
) : Celestial(name, isHabitable, hasAutmosphere, hasWater, isLandable)

class Satellite(
    name: String,
    isHabitable: Boolean,
    hasAutmosphere: Boolean,
    hasWater: Boolean,
    isLandable: Boolean,
    val parentPlanet: String,
) : Celestial(name, isHabitable, hasAutmosphere, hasWater, isLandable)


