package structural_pattern.Proxy

class DefaultProcessEjecutor : IProcessEjecutor {
    override fun executeProcess(idProcess: Int, user: String, password: String) {
        println("Proceso $idProcess en ejecución")
        println("Proceso $idProcess terminado")
    }
}
