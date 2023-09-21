package lesson_10

/** Created by Platon2025 */

fun main() {
    var humanWins = 0

    do {
        if (playRound()) humanWins++
        println("Хотите бросить ещё? Да или Нет")
    } while (readln().trim().equals("да", true))

    println("Вы выиграли $humanWins раз")

}

fun rollDices(): List<Int> {
    val range = 1..6
    return listOf(range.random(), range.random())

}

fun playRound(): Boolean {

    var roll = rollDices()
    println("Компьютер бросил кубики. Результат ${roll[0]} + ${roll[1]}")
    val machineResult = roll[0] + roll[1]
    roll = rollDices()
    Thread.sleep(1000)
    println("Человек бросил кубики. Результат ${roll[0]} + ${roll[1]}")
    val humanResult = roll[0] + roll[1]

    if (humanResult > machineResult) println("У вас больше\n")
    else if (humanResult < machineResult) println("У компьютера больше\n")
    else println("Результат равный\n")

    return humanResult > machineResult

}