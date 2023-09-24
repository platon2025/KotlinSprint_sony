package lesson_12

/** Created by Platon2025 */

fun main() {
    val weatherYesterday = Weather4(26, 17, 740, true)
    val weatherToday = Weather4(30, 22, 760)
    val weatherTomorrow = Weather4(28, 20, 765)

}

class Weather4(
    val dayTemp: Int,
    val nightTemp: Int,
    val atmPressure: Int,
    val isRainy: Boolean = false,
) {
    init {
        printWeatherInfo()
    }

    fun printWeatherInfo() {
        println("Дневная температура : $dayTemp\nНочная температура : $nightTemp\nДождь : $isRainy\nАтм.давление : $atmPressure\n")
    }
}