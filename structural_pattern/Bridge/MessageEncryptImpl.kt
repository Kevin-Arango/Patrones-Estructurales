package structural_pattern.Bridge

class MessageEncryptImpl (

    private var encryptAlgorithm: IEncryptAlgorithm):IMessageEncrypt {

    override fun encryptMessage (message: String, password: String): String{
        return encryptAlgorithm.encrypt(message, password)
    }
}


