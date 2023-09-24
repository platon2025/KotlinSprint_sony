package lesson_12

/** Created by Platon2025 */

fun main() {
    val weatherToday = Weather1()
    val weatherTomorrow = Weather1()

    weatherToday.dayTemp = 32
    weatherToday.nightTemp = 22
    weatherTomorrow.isRainy = true
    weatherTomorrow.atmPressure = 740

    weatherToday.printWeatherInfo()
    weatherTomorrow.printWeatherInfo()
}

class Weather1() {

    var dayTemp = 28
    var nightTemp = 18
    var isRainy = false
    var atmPressure = 760

    fun printWeatherInfo() {
        println("Дневная температура : $dayTemp\nНочная температура : $nightTemp\nДождь : $isRainy\nАтм.давление : $atmPressure\n")
    }
}