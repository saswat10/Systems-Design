package lowLevelPatterns.abstractFactoryPattern.factories

import lowLevelPatterns.abstractFactoryPattern.buttons.Button
import lowLevelPatterns.abstractFactoryPattern.checkboxes.Checkbox

interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}