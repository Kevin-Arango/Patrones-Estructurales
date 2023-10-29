package structural_pattern.Adapter

interface YBankCreditSenderListener {
    fun notifyCreditResult(result: YBankCreditResponse)
}
