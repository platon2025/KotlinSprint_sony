package lesson_13

/** Created by Platon2025 */

fun main() {
    val contact = Contact2("Зинаида", 89991005000, null)

}

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "[не указано]"}")
    }
}
