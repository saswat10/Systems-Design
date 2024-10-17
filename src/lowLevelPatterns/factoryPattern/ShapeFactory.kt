package lowLevelPatterns.factoryPattern

class ShapeFactory {

    fun getShape(input: String): Shape?{
        return when(input){
            "RECTANGLE" -> Rectangle()
            "CIRCLE" -> Circle()
            else -> null
        }
    }
}