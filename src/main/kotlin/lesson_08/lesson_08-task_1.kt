package lesson_08

/** Created by Platon2025 */

fun main() {
    val viewsSunday = 100_500
    val viewsMonday = 200_500
    val viewsTuesday = 300_500
    val viewsWedensday = 400_500
    val viewsThirsday = 500_500
    val viewsFriday = 600_500
    val viewsSaturday = 700_500

    val viewsWeek =
        intArrayOf(viewsSunday, viewsMonday, viewsTuesday, viewsWedensday, viewsThirsday, viewsFriday, viewsSaturday)

    var totalViews = 0
    for (i in viewsWeek) {
        totalViews += i
    }

    println("Общее количество просмотров за неделю : $totalViews")
}