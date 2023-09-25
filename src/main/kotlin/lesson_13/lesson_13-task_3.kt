package lesson_13

/** Created by Platon2025 */

fun main() {
    var contactList: MutableList<Contact3> = mutableListOf()

    contactList.add(Contact3("Зинаида Прокофьевна", 89991005000, null))
    contactList.add(Contact3("Платон Щукин", 89017007700, "Яндекс"))
    contactList.add(Contact3("Майк Вазовский", 89650545454, "Корпорация"))

    contactList.forEach {
        it.printContact()
    }
}

class Contact3(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContact() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "[не указано]"}\n")
    }
}