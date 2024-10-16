package LLD.StrategyPattern.Vehicle

import LLD.StrategyPattern.Drive.SportsDriveStrategy

class OffRoadVehicle: Vehicle(SportsDriveStrategy()) {
}