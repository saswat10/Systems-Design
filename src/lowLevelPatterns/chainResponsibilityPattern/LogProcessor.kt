package lowLevelPatterns.chainResponsibilityPattern

abstract class LogProcessor internal constructor(var nextLoggerProcessor: LogProcessor?) {
    open fun log(logLevel: Int, message: String?) {
        if (nextLoggerProcessor != null) {
            nextLoggerProcessor!!.log(logLevel, message)
        }
    }

    companion object {
        var INFO: Int = 1
        var DEBUG: Int = 2
        var ERROR: Int = 3
    }
}