package structural_pattern.Facade

import OnMemoryDataBase.findCustomerById

class CRMSystem {
    fun findCustomer(customerId: Long): Customer? {
        return findCustomerById(customerId)
    }
}