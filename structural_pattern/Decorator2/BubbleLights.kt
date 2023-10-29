package structural_pattern.Decorator2

import com.sun.source.tree.Tree

class BubbleLights(tree: IChristmasTree): TreeDecorator(tree) {

    override fun decorate(): String {
        return super.decorate() + decorateWithBubbleLights()
    }

    private fun decorateWithBubbleLights(): String{
        return "With Bubble Lights"
    }
}