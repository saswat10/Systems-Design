package lowLevelPatterns.strategyPattern.drive

class NormalDriveStrategy : DriveStrategy {
    override fun drive() {
        println("Normal Drive Capability")
    }
}