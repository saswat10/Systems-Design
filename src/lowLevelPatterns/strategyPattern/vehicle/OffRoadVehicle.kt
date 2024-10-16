package lowLevelPatterns.strategyPattern.vehicle

import lowLevelPatterns.strategyPattern.drive.SportsDriveStrategy

class OffRoadVehicle: Vehicle(SportsDriveStrategy()) {
}