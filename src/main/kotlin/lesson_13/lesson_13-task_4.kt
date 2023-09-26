package lesson_13

/** Created by Platon2025 */

fun main() {
    val contactList: MutableList<Contact4> = mutableListOf()

    println("Добавление нового контакта в Телефонную книгу")
    contactList += addContact()

    println("Обновленная телефонная книга\n")
    contactList.forEach {
        it.printContact()
    }
}

fun addContact(): MutableList<Contact4> {
    var phoneNumber = ""
    var name: String? = null
    var company: String? = null
    val extraContacts: MutableList<Contact4> = mutableListOf()

    while (true) {
        do {
            println("Введите номер телефона:")
            phoneNumber = readln().trim()
            if (phoneNumber.isEmpty()) println("Номер телефона является обязательным.")
        } while (phoneNumber.isEmpty())

        do {
            println("Введите Имя:")
            name = readln().trim()
            if (name == "") {
                name = null
                println("Так как вы не ввели имя, название Компании является обязательным")
            }

            println("Введите название Компании:")
            company = readln().trim()
            if (company == "") {
                company = null
                if (name == null) println("Необходимо ввести хотя бы один параметр Имя или название Компании")
            }

        } while (name == null && company == null)

        extraContacts += Contact4(name, phoneNumber, company)

        println("Если хотите добавить новую запись, введите \"да\"")
        if (!readln().trim().equals("да", true)) return extraContacts
    }
}

class Contact4(
    val name: String?,
    val phoneNumber: String,
    val company: String?,
) {
    fun printContact() {
        println(
            "Имя: ${name ?: "[не указано]"}\nНомер: $phoneNumber\nКомпания: ${company ?: "[не указано]"}\n"
        )
    }
}