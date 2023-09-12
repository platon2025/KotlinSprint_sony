package lesson_04

/** Created by Platon2025 */

const val TOTAL_TABLES = 13
fun main() {
    val freeTablesToday = 0
    val freeTablesTomorrow = 4
    val reservedTablesToday = TOTAL_TABLES - freeTablesToday
    val reservedTablesTomorrow = TOTAL_TABLES - freeTablesTomorrow

    println("Доступность столиков на сегодня: ${TOTAL_TABLES > reservedTablesToday}\nДоступность столиков на завтра: ${TOTAL_TABLES > reservedTablesTomorrow}")
}