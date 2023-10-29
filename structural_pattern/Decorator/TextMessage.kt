package structural_pattern.Decorator

class TextMessage(xml: String) : IMessage {

    override var content: String = ""
    override fun processMessage(): IMessage {
        return this
    }
}
