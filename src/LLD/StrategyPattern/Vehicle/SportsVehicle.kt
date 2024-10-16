package LLD.StrategyPattern.Vehicle

import LLD.StrategyPattern.Drive.SportsDriveStrategy

class SportsVehicle: Vehicle(SportsDriveStrategy()) {
}