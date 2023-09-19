package lesson_07

/** Created by Platon2025 */

fun main() {

    val rangeLetters = 'a'..'z'
    val rangeNumbers = '0'..'9'

    val p1 = rangeLetters.random().toString()
    val p2 = rangeNumbers.random().toString()
    val p3 = rangeLetters.random().toString()
    val p4 = rangeNumbers.random()
    val p5 = rangeLetters.random()
    val p6 = rangeNumbers.random()

    val password = p1 + p2 + p3 + "$p4$p5$p6" //два варианта объединения char в строку (через приведение toString и прямую интерполяцию)

    println(password)

}