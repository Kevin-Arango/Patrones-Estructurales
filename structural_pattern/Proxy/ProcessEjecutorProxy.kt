package structural_pattern.Proxy

class ProcessEjecutorProxy : IProcessEjecutor {
    override fun executeProcess(idProcess: Int, user: String, password: String) {
        val securityService = SecurityService()
        if (!securityService.authorization(user, password)) {
            throw Exception("El usuario '$user' no tiene privilegios para ejecutar el proceso")
        }

        val executorProcess = DefaultProcessEjecutor()
        executorProcess.executeProcess(idProcess, user, password)

        val audit = AuditService()
        audit.auditServiceUsed(user, DefaultProcessEjecutor::class.java.name)
    }
}
