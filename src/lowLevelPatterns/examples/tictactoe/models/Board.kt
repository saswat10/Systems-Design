package lowLevelPatterns.examples.tictactoe.models


class Board(var size: Int) {
    var board: Array<Array<PlayingPiece?>> = Array(size) { arrayOfNulls(size) }


    fun addPiece(row: Int, column: Int, playingPiece: PlayingPiece?): Boolean {
        if (board[row][column] != null) {
            return false
        }
        board[row][column] = playingPiece
        return true
    }


    val freeCells: List<Pair<Int, Int>>
        get() {
            val freeCells: MutableList<Pair<Int, Int>> = ArrayList()

            for (i in 0 until size) {
                for (j in 0 until size) {
                    if (board[i][j] == null) {
                        val rowColumn = Pair(i, j)
                        freeCells.add(rowColumn)
                    }
                }
            }

            return freeCells
        }

    fun printBoard() {
        for (i in 0 until size) {
            for (j in 0 until size) {
                if (board[i][j] != null) {
                    print(board[i][j]!!.pieceType.name + "   ")
                } else {
                    print("    ")
                }
                print(" | ")
            }
            println()
        }
    }
}
