package structural_pattern.Proxy

import java.text.SimpleDateFormat
import java.util.Date

class AuditService {
    fun auditServiceUsed(user: String, service: String) {
        val formatter = SimpleDateFormat("dd/MM/YYYY hh:mm:ss")
        println(user + "utilizó el servicio >" +service + "a las" +formatter.format(Date())
        )
    }
}
