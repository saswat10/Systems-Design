package lowLevelPatterns.chainResponsibilityPattern

object Demo1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val logObject: LogProcessor = InfoLogProcessor(DebugLogProcessor(ErrorLogProcessor(null)))

        logObject.log(LogProcessor.ERROR, "exception happens")
        logObject.log(LogProcessor.DEBUG, "need to debug this ")
        logObject.log(LogProcessor.INFO, "just for info ")
    }
}
