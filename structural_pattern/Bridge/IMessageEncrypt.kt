package structural_pattern.Bridge

interface IMessageEncrypt {
    fun encryptMessage (message: String, password: String): String
}