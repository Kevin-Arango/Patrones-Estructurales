package structural_pattern.Facade

data class PaymentResponse(
    val paymentConfirmNumber: String,
    val newBalance: Double,
    val customerStatus: String
)
