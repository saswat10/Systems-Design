package lowLevelPatterns.abstractFactoryPattern.factories

import lowLevelPatterns.abstractFactoryPattern.buttons.Button
import lowLevelPatterns.abstractFactoryPattern.buttons.WindowsButton
import lowLevelPatterns.abstractFactoryPattern.checkboxes.Checkbox
import lowLevelPatterns.abstractFactoryPattern.checkboxes.WindowsCheckbox

class WindowsFactory: GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}