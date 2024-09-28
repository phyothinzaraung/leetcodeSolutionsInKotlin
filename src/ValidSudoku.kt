//https://leetcode.com/problems/valid-sudoku/description/?envType=study-plan-v2&envId=top-interview-150

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rows = Array(9){ mutableSetOf<Char>() }
    val cols = Array(9){ mutableSetOf<Char>() }
    val boxes = Array(9){ mutableSetOf<Char>() }

    for (i in 0 until 9){
        for (j in 0 until 9){
            val num = board[i][j]
            if (num == '.') continue

            if (num in rows[i]) return false
            rows[i].add(num)

            if (num in cols[j]) return false
            cols[j].add(num)

            val boxIndex = (i/3) * 3 + (j/3)
            if (num in boxes[boxIndex]) return false
            boxes[boxIndex].add(num)
        }
    }
    return true
}

fun main() {
    val board = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    val result = isValidSudoku(board)
    println("Is the Sudoku valid? $result")

    val invalidBoard = arrayOf(
        charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    val invalidResult = isValidSudoku(invalidBoard)
    println("Is the Sudoku valid? $invalidResult")
}