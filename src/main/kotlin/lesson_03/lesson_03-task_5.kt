package lesson_03

/** Created by Platon2025 */

fun main() {
    val input =  "D2-D4;0"
    val from = input.substring(0,2)
    val to = input.substring(3,5)
    val step = input.substringAfter(';')

    println("From :\t$from")
    println("To :\t$to")
    println("Step :\t$step")
}