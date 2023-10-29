import structural_pattern.Decorator.*

fun main(){
    val user = User("Kevin Lara", "123456789123456")
    val customerMessage = CustomerMessage(
        "Ambrosio Cardoso Jimenez", "cardosojmz@gmail.com", "9513618396")

    println("Original Message ==> ${customerMessage} ")

    val message = RestDecorate(customerMessage)
    println("\n" + message.processMessage().content)

    val message1 = EncryptMessage(
        "usuario", "HG58YZ3CR9123456",
        SOAPEnvelopMessage(
            XMLFormatterDecorate(customerMessage)
        )
    ).processMessage().content
    println(
        "message1 =====================================>\n"
                + message1 + "\n\n"
    )

    val message2 = SOAPHeaderDecorator(SOAPEnvelopMessage(
        EncryptMessage(

            "usuario", "HG58YZ3CR9123456",
            XMLFormatterDecorate(customerMessage)
        )
    ), User("Genaro jose", "12345678")
    ).processMessage().content
    println(
        ("message2 =====================================>\n"
                + message2)
    )
}