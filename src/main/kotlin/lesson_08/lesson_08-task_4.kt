package lesson_08

/** Created by Platon2025 */

fun main() {

    val contents = arrayOf("свёкла", "картофель", "морковь", "капуста", "масло")
    var output: String

    output = "Список ингридиентов : "
    for (i in contents) output += "$i, "
    println(output.substring(0, output.length - 2))

    println("Какой ингридиент вы хотите заменить?")
    val remove = readln()
    if (!contents.contains(remove)) println("Ингредиента $remove нет в составе рецепта")
    else {
        println("На что вы хотели бы заменить $remove ?")
        contents[contents.indexOf(remove)] = readln()

        output = "Ингредиент заменён\nОбновленный состав ингредиентов: "
        for (i in contents) output += "$i, "
        println(output.substring(0, output.length - 2))
    }

}