package structural_pattern.Bridge

interface IEncryptAlgorithm {
    fun encrypt (message: String, password: String): String
}