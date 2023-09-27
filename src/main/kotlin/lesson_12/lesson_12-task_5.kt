package lesson_12

/** Created by Platon2025 */

fun main() {

    val pointsNumber = 10
    val dayTempRange = 20..32
    val nightTempRange = 15..22
    val atmPressRange = 700..800
    val rainRange = setOf(true, false)
    var controlPoint: Weather5
    val controlPoints: MutableList<Weather5> = mutableListOf()


    for (i in 1..pointsNumber) {
        controlPoint = Weather5(
            dayTempRange.random(),
            nightTempRange.random(),
            atmPressRange.random(),
            rainRange.random()
        )
        controlPoints.add(controlPoint)
        if (i == pointsNumber) controlPoint.printWeatherStats(controlPoints)
    }

}

class Weather5(
    val dayTemp: Int,
    val nightTemp: Int,
    val atmPressure: Int,
    val isRainy: Boolean = false,
) {

    fun printWeatherStats(controlPoints: MutableList<Weather5>) {
        var rainyDaysNumber = 0
        val averageAtmPressure = controlPoints.sumOf { it.atmPressure } / controlPoints.size
        val dayTempList: MutableList<Int> = mutableListOf()
        val nightTempList: MutableList<Int> = mutableListOf()

        controlPoints.forEach {
            dayTempList += it.dayTemp
            nightTempList += it.nightTemp
            if (it.isRainy == true) rainyDaysNumber++
        }

        println("Статистика за ${controlPoints.size} дней :\nСредняя дневная температура : ${dayTempList.average()}\nСредняя ночная температура : ${nightTempList.average()}\nСреднее атм.давление : $averageAtmPressure\nКоличество дождливых дней : $rainyDaysNumber")
    }
}