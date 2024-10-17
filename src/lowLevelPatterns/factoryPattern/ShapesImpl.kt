package lowLevelPatterns.factoryPattern

// concrete method

open class Rectangle: Shape {
    override fun draw() {
        println("rectangle")
    }
}

class Circle: Shape{
    override fun draw() {
        println("Circle")
    }
}
