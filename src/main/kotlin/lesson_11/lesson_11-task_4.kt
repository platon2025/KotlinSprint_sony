package lesson_11

/** Created by Platon2025 */

fun main() {

    val firstName = "First Name"
    val secondName = "Second Name"
    val faceTimeId = 1213141516
    val phones = mutableMapOf(Pair("сотовый", 89999994242), Pair("рабочий", 89998884242))
    val email = "mail@mail.ru"

    val contact = Contact4(
        firstName,
        secondName,
        "mouse.png",
        phones,
        faceTimeId,
        email
    )

    contact.makeVoiceCallByPhone("сотовый")
    contact.makeVideoCall()
    contact.sendMessage()
    contact.pinContact()
    println(contact.isPinned)


//    contact.icons.forEach{println(it.get())}

}