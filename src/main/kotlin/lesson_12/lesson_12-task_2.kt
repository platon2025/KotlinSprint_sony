package lesson_12

/** Created by Platon2025 */

fun main() {
    val weatherYesterday = Weather2(30, 20, false, 755)
    val weatherToday = Weather2(32, 22, false, 760)
    val weatherTomorrow = Weather2(28, 18, true, 740)

    weatherYesterday.printWeatherInfo()
    weatherToday.printWeatherInfo()
    weatherTomorrow.printWeatherInfo()

}

class Weather2(_dayTemp: Int, _nightTemp: Int, _isRainy: Boolean, _atmPressure: Int) {

    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var isRainy = _isRainy
    var atmPressure = _atmPressure

    fun printWeatherInfo() {
        println("Дневная температура : $dayTemp\nНочная температура : $nightTemp\nДождь : $isRainy\nАтм.давление : $atmPressure\n")
    }
}