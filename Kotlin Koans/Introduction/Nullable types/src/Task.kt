fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    client ?: return
    message ?: return

    client.personalInfo?.let {
        if(it.email != null)
            mailer.sendMessage(it.email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
