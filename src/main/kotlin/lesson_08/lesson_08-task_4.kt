package lesson_08

/** Created by Platon2025 */

fun main() {

    val contents = arrayOf("свёкла", "картофель", "морковь", "капуста", "масло")

    println("Список ингридиентов : ${contents.joinToString(", ")}.")

    println("Какой ингридиент вы хотите заменить?")
    val remove = readln().lowercase()
    if (!contents.contains(remove)) println("Ингредиента $remove нет в составе рецепта")
    else {
        println("На что вы хотели бы заменить $remove ?")
        contents[contents.indexOf(remove)] = readln()

        println("Готово!\nВы сохранили следующий список: ${contents.joinToString(", ")}.")
    }

}