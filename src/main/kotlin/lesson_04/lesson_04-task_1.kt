package lesson_04

/** Created by Platon2025 */

fun main() {
    val totalTables = 13

    val reservedTablesToday = 13
    val reservedTablesTomorrow = 13 - 4

    val freeTablesToday = totalTables > reservedTablesToday
    val freeTablesTomorrow = totalTables > reservedTablesTomorrow

    println("Доступность столиков на сегодня: $freeTablesToday\nДоступность столиков на завтра: $freeTablesTomorrow")
}