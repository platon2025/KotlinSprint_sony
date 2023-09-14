package lesson_04

/** Created by Platon2025 */

const val MIN_CREW_NUM = 55
const val MAX_CREW_NUM = 70
const val RECOMMENDED_CREW_NUM = 70
const val MIN_PROVISION = 50

fun main() {

    var input: String
    val crew: Int
    val provision: Int

    println("Есть ли повреждения на корпусе корабля? Да или Нет")
    val isDamaged = readln().lowercase() == "да"
    println("Повреждения: $isDamaged\n")

    println("Укажите число экипажа")
    input = readln()
    if (input.isEmpty()) crew = 0
    else crew = input.toInt()
    println("Экипаж в составе: $crew чел.\n")

    println("Сколько ящиков шампанского на борту?")
    input = readln()
    if (input.isEmpty()) provision = 0
    else provision = input.toInt()
    println("Провизии $provision ящ.\n")

    println("Погода благоприятная? Да или Нет")
    val weather = readln().lowercase() == "да"
    println("Погода: $weather\n")

    var departApprove = "не разрешен"

    if (!isDamaged && crew in MIN_CREW_NUM..MAX_CREW_NUM && provision > MIN_PROVISION
        || crew == RECOMMENDED_CREW_NUM && weather && provision > MIN_PROVISION
    ) departApprove = "разрешен"

    println("Комиссия все проверила и постановила : Кораблю $departApprove выход в море.")

}