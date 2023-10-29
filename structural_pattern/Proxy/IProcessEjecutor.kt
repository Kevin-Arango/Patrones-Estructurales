package structural_pattern.Proxy

interface IProcessEjecutor {
    fun executeProcess(idProcess: Int, user: String, password: String)
}
