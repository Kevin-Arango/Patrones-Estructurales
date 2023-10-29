package structural_pattern.Bridge

class NoEncryptAlgorithm: IEncryptAlgorithm{
    override fun encrypt (message: String, password: String): String{
        return message
    }
}