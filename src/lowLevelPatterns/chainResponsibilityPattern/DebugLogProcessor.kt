package lowLevelPatterns.chainResponsibilityPattern


class DebugLogProcessor internal constructor(nexLogProcessor: LogProcessor?) : LogProcessor(nexLogProcessor) {
    fun log(logLevel: Int, message: String) {
        if (logLevel == DEBUG) {
            println("DEBUG: $message")
        } else {
            super.log(logLevel, message)
        }
    }
}
