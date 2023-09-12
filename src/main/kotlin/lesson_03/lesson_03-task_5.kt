package lesson_03

/** Created by Platon2025 */

fun main() {
    val input =  "D2-D4;0"
    val parts = input.split('-',';')
    val from = parts[0]
    val to = parts[1]
    val step = parts[2]

    println("From :\t$from")
    println("To :\t$to")
    println("Step :\t$step")
}