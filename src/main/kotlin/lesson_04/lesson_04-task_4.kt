package lesson_04

/** Created by Platon2025 */

fun main() {
    val dayNumber = 1

    val oddDay = 1
    val evenDay = 0
    val exercises = mutableMapOf("Упражнения для рук" to oddDay, "Упражнения для ног" to evenDay)
    exercises.put("Упражнения для спины", evenDay)
    exercises.put("Упражнения для пресса", oddDay)

    var output = ""
    exercises.forEach { (exs, day) -> output += "$exs:\t ${ dayNumber % 2 == day}\n" }

    println (output)
}