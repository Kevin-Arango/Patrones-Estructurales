package structural_pattern.Facade

data class GeneralPaymentError(override val message:String): Exception(message)

