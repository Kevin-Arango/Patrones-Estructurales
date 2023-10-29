package structural_pattern.Proxy

class SecurityService {
    fun authorization(user: String, password: String): Boolean {

        return if (user == "Kevin Lara" && password == "itvo23") {
            println("Usuario $user autorizado")
            true
        } else {
            println("Usuario $user NO autorizado")
            false
        }
    }
}
