package lowLevelPatterns.abstractFactoryPattern.buttons

class MacOSButton:Button {
    override fun render() {
        println("You've created a MacOS Button")
    }
}