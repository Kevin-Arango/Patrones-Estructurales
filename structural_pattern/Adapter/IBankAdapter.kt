package structural_pattern.Adapter

interface IBankAdapter {
    suspend fun sendCreditRequest(
        bankCreditRequest: BankCreditRequest
    ): BankCreditResponse

}


