package structural_pattern.Decorator2

class Sphere(tree: IChristmasTree): TreeDecorator(tree) {

    override fun decorate(): String {
        return super.decorate() + decorateWithSpheres()
    }

    private fun decorateWithSpheres(): String{
        return "With spheres"
    }
}