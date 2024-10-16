package LLD.StrategyPattern.Vehicle

import LLD.StrategyPattern.Drive.DriveStrategy

/** construct injection */
public open class Vehicle(private val driveObject: DriveStrategy){
    fun drive(){
        driveObject.drive()
    }
}