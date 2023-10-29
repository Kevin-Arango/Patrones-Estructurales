package structural_pattern.Decorator2

abstract class TreeDecorator
    (private val tree:IChristmasTree) : IChristmasTree{
    override fun decorate(): String{
        return tree.decorate()
    }
    }
