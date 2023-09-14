package lesson_04

/** Created by Platon2025 */

const val TOTAL_TABLES = 13
fun main() {
    val freeTablesToday = 0
    val freeTablesTomorrow = 4
    val reservedTablesToday = TOTAL_TABLES - freeTablesToday
    val reservedTablesTomorrow = TOTAL_TABLES - freeTablesTomorrow
/*
В задании написано :

    Напиши программу, которая сообщает информацию о бронировании в момент запроса,
    путем сравнения данных о свободных столах с данными о столах в ресторане.

Не понял, в чем смысл такого сравнения, и зачем для этого вводить переменные с количеством забронированных столов
*/
    println("Доступность столиков на сегодня: ${ freeTablesToday > 0 }\nДоступность столиков на завтра: ${ freeTablesTomorrow > 0 }")
}