package structural_pattern.Decorator2

class Star(tree: IChristmasTree): TreeDecorator(tree) {

    override fun decorate(): String {
        return super.decorate() + decorateWithStar()
    }

    private fun decorateWithStar(): String{
        return "With star"
    }
}