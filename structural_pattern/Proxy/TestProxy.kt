package structural_pattern.Proxy

fun main(){
    val securedFile = SecuredFile()
    securedFile.read("readm.md")

    securedFile.password = "secret"
    securedFile.read("readme.md")

    val user= "Kevin Lara"
    val password = "itvo23"
    val process = 1
    val processEjecutor = ServiceFactory.createProcessEjecutor()
    try {
        processEjecutor.executeProcess(process, user, password)
    }
    catch (e:Exception){
        print(e.message)
    }

}