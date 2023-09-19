package lesson_06

/** Created by Platon2025 */
fun main() {
    val minNum = 1
    val maxNum = 9
    val secret = (minNum..maxNum).random()
    var counter = 5
    var enter: Int
    println("Загадано число от $minNum до $maxNum")
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