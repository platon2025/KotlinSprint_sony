package lesson_03

/** Created by Platon2025 */

fun main() {

    val number = 6

    val table = """
        $number x 1 = $number
        $number x 2 = ${2 * number}
        $number x 3 = ${3 * number}
        $number x 4 = ${4 * number}
        $number x 5 = ${5 * number}
        $number x 6 = ${6 * number}
        $number x 7 = ${7 * number}
        $number x 8 = ${8 * number}
        $number x 9 = ${9 * number}
    """.trimIndent()

    println(table)

}