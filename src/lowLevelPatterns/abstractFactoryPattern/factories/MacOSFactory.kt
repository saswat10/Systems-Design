package lowLevelPatterns.abstractFactoryPattern.factories

import lowLevelPatterns.abstractFactoryPattern.buttons.Button
import lowLevelPatterns.abstractFactoryPattern.buttons.MacOSButton
import lowLevelPatterns.abstractFactoryPattern.checkboxes.Checkbox
import lowLevelPatterns.abstractFactoryPattern.checkboxes.MacOSCheckbox

class MacOSFactory: GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createCheckbox(): Checkbox {
        return MacOSCheckbox()
    }
}