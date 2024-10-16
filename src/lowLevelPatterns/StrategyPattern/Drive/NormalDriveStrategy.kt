package lowLevelPatterns.StrategyPattern.Drive

class NormalDriveStrategy : DriveStrategy {
    override fun drive() {
        println("Normal Drive Capability")
    }
}