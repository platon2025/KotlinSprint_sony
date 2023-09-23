package lesson_10

/** Created by Platon2025 */

fun main() {
    val rounds = 5
    var machineScore = 0
    var humanScore = 0
    var roll: List<Int>

    for (i in 1..rounds) {
        roll = rollDices3()
        println("Компьютер бросил кубики. Результат ${roll[0]} + ${roll[1]}")
        machineScore += roll[0] + roll[1]
        roll = rollDices3()
        Thread.sleep(1000)
        println("Человек бросил кубики. Результат ${roll[0]} + ${roll[1]}")
        humanScore += roll[0] + roll[1]
        Thread.sleep(2000)
    }

    if (humanScore > machineScore) println("С общим результатом $humanScore : $machineScore победил Человек")
    else if (humanScore < machineScore) println("С общим результатом $humanScore : $machineScore победил Компьютер")
    else println("По итогам $rounds раундов результат равный $humanScore : $machineScore")
}

fun rollDices3(): List<Int> {
    val range = 1..6
    return listOf(range.random(), range.random())
}