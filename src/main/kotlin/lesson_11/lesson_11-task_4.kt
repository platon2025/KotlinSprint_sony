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

class Contact4(
    var firstName: String = "",
    var secondName: String = "",
    var contactPicture: String = "",
    val phones: MutableMap<String, Long> = mutableMapOf(),
    var faceTimeId: Int = 0,
    var email: String = "",
    var isPinned: Boolean = false,
    val icons: List<Icon4> = listOf(
        Icon4("sqaureIcon", "send_message.ico", "написать", "sendMessage()"),
        Icon4("sqaureIcon", "voice_call.ico", "вызов", "makeVoiceCallByPhone()"),
        Icon4("sqaureIcon", "video_call.ico", "видео", "makeVideoCall()"),
        Icon4("sqaureIcon", "email.ico", "почта", "sendMessage()"),
        Icon4("roundIcon", "voice_call.ico", "", "makeVoiceCallByFaceTime()"),
        Icon4("roundIcon", "video_call.ico", "", "makeVideoCall()")
    )

) {

    fun makeVoiceCallByPhone(phoneLabel: String) {
        println("Производится голосовой вызов ${getPhoneByLabel(phoneLabel)}")
    }

    fun makeVoiceCallByFaceTime() {
        println("Производится голосовой вызов faceId $faceTimeId")
    }

    fun makeVideoCall() {
        println("Производится видео вызов faceId $faceTimeId")
    }

    fun sendMessage() {
        println("Производится отправка эл.сообщения на адрес $email")
    }

    fun pinContact() {
        isPinned = true
        println("Контакт закреплён")
    }

    fun unpinContact() {
        isPinned = false
        println("Контакт откреплён")
    }

    private fun getPhoneByLabel(phoneLabel: String): Long = phones[phoneLabel] ?: 0

}

class Icon4(
    val iconType: String,
    val iconPic: String,
    val iconText: String,
    val iconAction: String,
) {
    fun get() = mapOf<String, String>(
        Pair("iconType", iconType),
        Pair("iconPic", iconPic),
        Pair("iconText", iconText),
        Pair("iconAction", iconAction)
    )
}