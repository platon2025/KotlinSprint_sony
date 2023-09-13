package lesson_04

/** Created by Platon2025 */

fun main() {
    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    var season = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isConditionsFavorable(isSunny, isTentOpen, airHumidity, season)}")

    season = "summer"
    println("Благоприятные ли условия сейчас для роста бобовых? ${isConditionsFavorable(isSunny, isTentOpen, airHumidity, season)}")

}

fun isConditionsFavorable(sunny: Boolean, tentOpen: Boolean, humidity:Int, season: String): Boolean {
    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val goodSeason = "summer"

    return (sunny == isSunny && tentOpen == isTentOpen && humidity == airHumidity && season == goodSeason)
}