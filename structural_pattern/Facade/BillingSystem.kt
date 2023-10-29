package structural_pattern.Facade

import OnMemoryDataBase.findCustomerById

class BillingSystem() {
    fun queryCustomerBalance(customerId: Long?): Double {
        val customer = findCustomerById(customerId!!)
        return customer!!.balance
    }

    fun pay(billingPay: BillingPayRequest): Double {
        val customer = findCustomerById(billingPay.customerId)
        customer!!.balance = customer.balance - billingPay.amount
        println(
            ("Pago aplicado al cliente '" + customer.fullName)+ "', "
                    + "el nuevo saldo es '" + customer.balance + "'"
        )
        return customer.balance //new Balance.
    }
}