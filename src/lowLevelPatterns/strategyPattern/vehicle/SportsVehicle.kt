package lowLevelPatterns.strategyPattern.vehicle

import lowLevelPatterns.strategyPattern.drive.SportsDriveStrategy

class SportsVehicle: Vehicle(SportsDriveStrategy()) {
}