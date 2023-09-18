package lesson_07

/** Created by Platon2025 */

fun main() {
    var outputString = ""

    println("Введите число")
    val maxNum = readln().toInt()
    for (num in 0..maxNum step 2) {
        outputString += "$num,"
    }
    outputString = outputString.dropLast(1)
    println("Все четные числа от 0 до $maxNum:\n$outputString")


}