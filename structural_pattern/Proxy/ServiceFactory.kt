package structural_pattern.Proxy

class ServiceFactory {
    companion object {
        fun createProcessEjecutor(): IProcessEjecutor {
            return ProcessEjecutorProxy()
        }
    }
}
