package structural_pattern.Facade

data class TransferRequest(
        val amount: Double,
        val cardNumber: String,
        val cardName: String,
        val cardExpireDate: String,
        val cardSecureNumber: String
)
