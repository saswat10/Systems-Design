package lowLevelPatterns.StrategyPattern.Vehicle

import lowLevelPatterns.StrategyPattern.Drive.SportsDriveStrategy

class OffRoadVehicle: Vehicle(SportsDriveStrategy()) {
}