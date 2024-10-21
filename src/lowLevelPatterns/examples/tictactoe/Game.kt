package lowLevelPatterns.examples.tictactoe

import lowLevelPatterns.examples.tictactoe.models.*
import java.util.*


class Game {
    var players: Deque<Player>? = null
    var gameBoard: Board? = null


    fun initializeGame() {
        //creating 2 Players

        players = LinkedList()
        val crossPiece = PlayingPieceX()
        val player1 = Player("Player1", crossPiece)

        val noughtsPiece = PlayingPieceO()
        val player2 = Player("Player2", noughtsPiece)

        (players as LinkedList<Player>).add(player1)
        (players as LinkedList<Player>).add(player2)

        //initializeBoard
        gameBoard = Board(3)
    }

    fun startGame(): String {
        var noWinner = true
        while (noWinner) {
            //take out the player whose turn is and also put the player in the list back

            val playerTurn = players!!.removeFirst()

            //get the free space from the board
            gameBoard!!.printBoard()
            val freeSpaces = gameBoard!!.freeCells
            if (freeSpaces.isEmpty()) {
                noWinner = false
                continue
            }

            //read the user input
            print("Player:" + playerTurn.name + " Enter row,column: ")
            val inputScanner: Scanner = Scanner(System.`in`)
            val s: String = inputScanner.nextLine()
            val values = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val inputRow = values[0].toInt()
            val inputColumn = values[1].toInt()


            //place the piece
            val pieceAddedSuccessfully = gameBoard!!.addPiece(inputRow, inputColumn, playerTurn.playingPiece)
            if (!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                println("Incorrect position chosen, try again")
                players!!.addFirst(playerTurn)
                continue
            }
            players!!.addLast(playerTurn)

            val winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType)
            if (winner) {
                return playerTurn.name
            }
        }

        return "tie"
    }

    fun isThereWinner(row: Int, column: Int, pieceType: PieceType): Boolean {
        var rowMatch = true
        var columnMatch = true
        var diagonalMatch = true
        var antiDiagonalMatch = true

        //need to check in row
        for (i in 0 until gameBoard!!.size) {
            if (gameBoard!!.board[row][i] == null || gameBoard!!.board[row][i]!!.pieceType != pieceType) {
                rowMatch = false
            }
        }

        //need to check in column
        for (i in 0 until gameBoard!!.size) {
            if (gameBoard!!.board[i][column] == null || gameBoard!!.board[i][column]!!.pieceType != pieceType) {
                columnMatch = false
            }
        }

        //need to check diagonals
        run {
            var i = 0
            var j = 0
            while (i < gameBoard!!.size) {
                if (gameBoard!!.board[i][j] == null || gameBoard!!.board[i][j]!!.pieceType != pieceType) {
                    diagonalMatch = false
                }
                i++
                j++
            }
        }

        //need to check anti-diagonals
        var i = 0
        var j = gameBoard!!.size - 1
        while (i < gameBoard!!.size) {
            if (gameBoard!!.board[i][j] == null || gameBoard!!.board[i][j]!!.pieceType != pieceType) {
                antiDiagonalMatch = false
            }
            i++
            j--
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch
    }
}
