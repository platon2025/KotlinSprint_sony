package lesson_02

import kotlin.math.pow

/** Created by Platon2025 */

fun main() {
    val initAmount = 70_000
    val rate = 16.7
    val years = 20
    val currentAmount: Double

    currentAmount = initAmount.toDouble() * (1 + rate / 100).pow(years) //формула сложного процента

    val outputString = String.format("%.3f", currentAmount)

    println (outputString)
}