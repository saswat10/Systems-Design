package lowLevelPatterns.decoratorPattern


/*  An abstract member does not have an implementation in its class.  */
/*  Adding open keyword here would make it redundant
* */
abstract class BasePizza{
    abstract fun cost(): Int
}

// base pizzas

class Farmhouse: BasePizza(){
    override fun cost(): Int {
        return 200
    }
}

class VegDelight: BasePizza(){
    override fun cost(): Int {
        return 120
    }
}

class Margerhita: BasePizza(){
    override fun cost(): Int {
        return 150
    }
}

// toppings abstract class

abstract class ToppingDecorator(val pizza: BasePizza): BasePizza()


class ExtraCheese(pizza: BasePizza): ToppingDecorator(pizza){
    override fun cost(): Int {
        return pizza.cost() + 10
    }
}

class Mushroom(pizza: BasePizza): ToppingDecorator(pizza){
    override fun cost(): Int {
        return pizza.cost() + 50
    }
}

fun main(){
    val musEx = ExtraCheese(Mushroom(VegDelight())) // -> return 180
    println(musEx.cost())
}