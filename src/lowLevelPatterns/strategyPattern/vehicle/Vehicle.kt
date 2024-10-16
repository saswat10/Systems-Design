package lowLevelPatterns.strategyPattern.vehicle

import lowLevelPatterns.strategyPattern.drive.DriveStrategy

/** construct injection */
public open class Vehicle(private val driveObject: DriveStrategy){
    fun drive(){
        driveObject.drive()
    }
}