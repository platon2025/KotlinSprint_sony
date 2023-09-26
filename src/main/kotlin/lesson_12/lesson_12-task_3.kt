package lesson_12

/** Created by Platon2025 */

fun main() {
    val weatherYesterday = Weather3(26, 17, 740, true)
    val weatherToday = Weather3(30, 22, 760)
    val weatherTomorrow = Weather3(28, 20, 765)

    weatherYesterday.printWeatherInfo()
    weatherToday.printWeatherInfo()
    weatherTomorrow.printWeatherInfo()

}

class Weather3(
    val dayTemp: Int,
    val nightTemp: Int,
    val atmPressure: Int,
    val isRainy: Boolean = false,
) {
    fun printWeatherInfo() {
        println("Дневная температура : $dayTemp\nНочная температура : $nightTemp\nДождь : $isRainy\nАтм.давление : $atmPressure\n")
    }
}