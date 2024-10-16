package lowLevelPatterns.StrategyPattern.Vehicle

import lowLevelPatterns.StrategyPattern.Drive.SportsDriveStrategy

class SportsVehicle: Vehicle(SportsDriveStrategy()) {
}