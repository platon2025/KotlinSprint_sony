package lesson_07

/** Created by Platon2025 */

fun main() {

    val rangeLetters = 'a'..'z'
    val rangeNumbers = '0'..'9'

    val p1 = rangeLetters.random().toString()
    val p2 = rangeNumbers.random().toString()
    val p3 = rangeLetters.random().toString()
    val p4 = rangeNumbers.random().toString()
    val p5 = rangeLetters.random().toString()
    val p6 = rangeNumbers.random().toString()

    val password = p1 + p2 + p3 + p4 + p5 + p6

    println(password)


//    val passwordLength = 6
//    val string = "0123456789absdefghijklmnopqrstuvwxyz"
//    var pos: Int //позиция символа в строке
//
//    var password = ""
//
//    for (i in 1..passwordLength) {
//        pos = (0 until string.length).random()
//        password += string[pos]
//    }
//    println(password)

}