package lowLevelPatterns.factoryPattern

class MainFunction {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val obj =  ShapeFactory()
            val shapeObj = obj.getShape("crcle".uppercase())
            shapeObj?.draw()
        }

    }
}