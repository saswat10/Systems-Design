package lowLevelPatterns.abstractFactoryPattern

import lowLevelPatterns.abstractFactoryPattern.buttons.Button
import lowLevelPatterns.abstractFactoryPattern.checkboxes.Checkbox
import lowLevelPatterns.abstractFactoryPattern.factories.GUIFactory

class Application(factory: GUIFactory) {
    private var button: Button = factory.createButton()
    private var checkbox: Checkbox = factory.createCheckbox()

    fun paint(){
        button.render()
        checkbox.render()
    }
}