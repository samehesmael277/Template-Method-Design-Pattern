abstract class MakePizzaAlgorithm {

    private fun bakePizza() {
        println("Baking Pizza .....")
    }

    abstract fun definePizzaShape()

    private fun putAddons() {
        println("Putting Pizza Addons .....")
    }

    private fun heatPizza() {
        println("Heating Pizza .....")
    }

    fun makePizza() {
        bakePizza()
        definePizzaShape()
        putAddons()
        heatPizza()
    }
}