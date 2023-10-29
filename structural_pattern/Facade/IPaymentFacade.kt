package structural_pattern.Facade
interface IPaymentFacade {
    fun pay(paymentRequest: PaymentRequest): PaymentResponse
}
