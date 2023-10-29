package structural_pattern.Facade

import OnMemoryDataBase.getCardCompany
import OnMemoryDataBase.validateCardBins
import java.util.UUID

class BankSystem() {
    @Throws(GeneralPaymentError::class)
    fun transfer(request: TransferRequest): String {
        val cardNumberPrefix = request.cardNumber.substring(0, 3)
        if (!validateCardBins(cardNumberPrefix)) {
            throw GeneralPaymentError("Tarjeta inválida.")
        }
        val cardCompany = getCardCompany(cardNumberPrefix)
        if ("AMEX" == cardCompany && request.cardNumber.length != 15) {
            throw GeneralPaymentError("El número de la tarjeta es inválido")
        } else if (("VISA" == cardCompany || "MASTERCARD" == cardCompany)
            && request.cardNumber.length != 16
        ) {
            throw GeneralPaymentError("El número de la tarjeta es inválido")
        }
        val number = request.cardNumber
        val cardNumerSubfix = number.substring(number.length - 4, number.length)
        println(
            ("Se ha realizado un cargo al cliente '"
                    + request.cardName + "' \n"
                    + "\tpor el monto de '" + request.amount) + "' a la tarjeta "
                    + "terminación '" + cardNumerSubfix + "'.\n"
        )
        return UUID.randomUUID().toString()
    }
}