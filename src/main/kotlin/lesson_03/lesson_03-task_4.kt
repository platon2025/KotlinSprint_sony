package lesson_03

/** Created by Platon2025 */

fun main(){
    var count: Int = 1
    var fromCell: String = "E2"
    var toCell: String = "E4"
    println("$fromCell-$toCell;$count")

    count = 3 // такой ход не может быть вторым в партии
    fromCell = "D2"
    toCell = "D3"
    println("$fromCell-$toCell;$count")
}