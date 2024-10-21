package lowLevelPatterns.chainResponsibilityPattern

class ErrorLogProcessor internal constructor(nexLogProcessor: LogProcessor?) : LogProcessor(nexLogProcessor) {
    override fun log(logLevel: Int, message: String?) {
        if (logLevel == ERROR) {
            println("ERROR: $message")
        } else {
            super.log(logLevel, message)
        }
    }
}

