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
        var dayTempsSum = 0
        var nightTempsSum = 0
        var atmPressureSum = 0
        var rainyDaysNumber = 0
        var daysNumber = 0

        controlPoints.forEach {
            dayTempsSum += it.dayTemp
            nightTempsSum += it.nightTemp
            atmPressureSum += it.atmPressure
            if (it.isRainy) rainyDaysNumber++
            daysNumber++
        }

        println("Статистика за $daysNumber дней :\nСредняя дневная температура : ${dayTempsSum / daysNumber}\nСредняя ночная температура : ${nightTempsSum / daysNumber}\nСреднее атм.давление : ${atmPressureSum / daysNumber}\n")

    }
}