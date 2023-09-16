package lesson_07

/** Created by Platon2025 */

fun main() {

    val passwordLength = 6
    val string = "0123456789absdefghijklmnopqrstuvwxyz"
    var pos: Int //позиция символа в строке

    var password = ""

    /*  не понял, для чего требуется создавать отдельную переменную для каждого символа,
        и как собственно это организовать. Сделал без этого.  */

    for (i in 1..passwordLength) {
        pos = (0 until string.length).random()
        password += string[pos]
    }
    println(password)
}