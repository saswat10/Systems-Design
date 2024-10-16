package lowLevelPatterns.StrategyPattern.Vehicle

import lowLevelPatterns.StrategyPattern.Drive.DriveStrategy

/** construct injection */
public open class Vehicle(private val driveObject: DriveStrategy){
    fun drive(){
        driveObject.drive()
    }
}