package lesson_12

/** Created by Platon2025 */

fun main() {
    val weatherToday = Weather2(32, 22, false, 760)
    val weatherTomorrow = Weather2(28, 18, true, 740)

    weatherToday.printWeatherInfo()
    weatherTomorrow.printWeatherInfo()

}

class Weather2(dayTemp: Int, nightTemp: Int, isRainy: Boolean, atmPressure: Int) {

    var dayTemp = dayTemp
    var nightTemp = nightTemp
    var isRainy = isRainy
    var atmPressure = atmPressure

    fun printWeatherInfo() {
        println("Дневная температура : $dayTemp\nНочная температура : $nightTemp\nДождь : $isRainy\nАтм.давление : $atmPressure\n")
    }
}