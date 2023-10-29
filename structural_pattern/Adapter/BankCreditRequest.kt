package structural_pattern.Adapter

data class BankCreditRequest(
    val customer: String,
    val amount: Double)