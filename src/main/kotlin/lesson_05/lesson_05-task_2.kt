package lesson_05

import java.text.SimpleDateFormat
import java.util.*

/** Created by Platon2025 */

const val AGE_OF_MAJORITY = 18
fun main() {
    val sdf = SimpleDateFormat("yyyy")
    val currentYear = sdf.format(Date()).toInt()
    val userAge: Int

    println("Введите свой год рождения :\n(если не знаете, спросите у мамы)")
    val input = readln()
    if (input.isEmpty()) userAge = 0 else userAge = currentYear - input.toInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Полный доступ предоставлен"
    else "Нужно еще немного подрасти. Сорри"

    println(resultText)

}