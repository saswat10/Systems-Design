package lowLevelPatterns.chainResponsibilityPattern

class InfoLogProcessor internal constructor(nexLogProcessor: LogProcessor?) : LogProcessor(nexLogProcessor) {
    override fun log(logLevel: Int, message: String?) {
        if (logLevel == INFO) {
            println("INFO: $message")
        } else {
            super.log(logLevel, message)
        }
    }
}
