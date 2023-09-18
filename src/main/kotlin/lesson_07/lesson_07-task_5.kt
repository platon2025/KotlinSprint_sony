package lesson_07

/** Created by Platon2025 */

fun main() {
    println("Введите желаемую длину пароля : ")
    val passwordLength = readln().toInt()
    val string = "0123456789absdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var pos: Int //позиция символа в строке

    var password = ""

    for (i in 1..passwordLength) {
        pos = (0 until string.length).random()
        password += string[pos]
    }
    println("Пароль : $password")
}