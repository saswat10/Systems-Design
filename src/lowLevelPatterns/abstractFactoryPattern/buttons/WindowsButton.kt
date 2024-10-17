package lowLevelPatterns.abstractFactoryPattern.buttons

class WindowsButton: Button {
    override fun render() {
        println("You've created a Windows Button")
    }
}