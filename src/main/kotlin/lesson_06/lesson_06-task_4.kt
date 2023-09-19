package lesson_06

/** Created by Platon2025 */
const val MIN_NUM = 1
const val MAX_NUM = 9
fun main() {
    val secret = (MIN_NUM..MAX_NUM).random()
    var counter = 5
    var enter: Int
    println("Загадано число от $MIN_NUM до $MAX_NUM")
    println("У тебя $counter попыток чтобы его угадать")
    println("Введи число :")
    do {
        enter = readln().toInt()
        if (enter == secret) {
            println("Бинго! Это была великолепная игра!")
            return
        }
        else {
            counter--
            if (counter > 0) println("Не-а. Осталось $counter попыток")
        }
    } while (counter > 0)

    println("Не удалось!\nБыло загадано число $secret")
}