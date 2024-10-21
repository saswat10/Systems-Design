package lowLevelPatterns.examples.tictactoe

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val game = Game()
        game.initializeGame()
        println("game winner is: " + game.startGame())
    }
}
