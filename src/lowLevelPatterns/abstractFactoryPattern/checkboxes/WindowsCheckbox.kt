package lowLevelPatterns.abstractFactoryPattern.checkboxes

class WindowsCheckbox: Checkbox {
    override fun render() {
        println("You've created a windows checkbox")
    }
}