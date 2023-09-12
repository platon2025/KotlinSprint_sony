package lesson_04

/** Created by Platon2025 */

fun main() {

    println("Есть ли повреждения на корпусе корабля? Да или Нет")
    val damage = readLine() == "Да"
    println("Повреждения: $damage\n")

    println("Укажите число экипажа")
    val crew = readLine()!!.toInt()
    println("Экипаж в составе: $crew чел.\n")

    println("Сколько ящиков шампанского на борту?")
    val provision = readLine()!!.toInt()
    println("Провизии $provision ящ.\n")

    println("Погода благоприятная? Да или Нет")
    val weather = readLine() == "Да"
    println("Погода: $weather\n")

    var departApprove = "не разрешен"

    if( !damage && crew in 55..70 && provision > 50 ) departApprove = "разрешен"
    if( crew == 70 && weather && provision > 50) departApprove = "разрешен"

    println ("Комиссия все проверила и постановила : Кораблю $departApprove выход в море.")

}