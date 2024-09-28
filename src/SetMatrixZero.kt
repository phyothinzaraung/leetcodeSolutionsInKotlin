//https://leetcode.com/problems/set-matrix-zeroes/?envType=study-plan-v2&envId=top-interview-150

fun setZeroes(matrix: Array<IntArray>): Unit {
    val rows = matrix.size
    val cols = matrix[0].size
    var rowZero = false
    var colZero = false

    for (i in 0 until rows){
        if (matrix[i][0] == 0) colZero = true
    }

    for (i in 0 until cols){
        if (matrix[0][i] == 0) rowZero = true
    }

    for (i in 1 until rows){
        for (j in 1 until cols){
            if (matrix[i][j] == 0){
                matrix[i][0] = 0
                matrix[0][j] = 0
            }
        }
    }

    for (i in 1 until rows){
        for (j in 1 until cols){
            if (matrix[i][0] == 0 || matrix[0][j] == 0){
                matrix[i][j] = 0
            }
        }
    }

    if (rowZero){
        for (j in 0 until cols){
            matrix[0][j] = 0
        }
    }

    if (colZero){
        for (i in 0 until rows){
            matrix[i][0] = 0
        }
    }

    printMatrix(matrix)

}

fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println() // move to the next line after each row
    }
}
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 0, 1),
        intArrayOf(1, 1, 1)
    )

    setZeroes(matrix)

    println("---------------------")

    val matrix1 = arrayOf(
        intArrayOf(0,1,2,0),
        intArrayOf(3,4,5,2),
        intArrayOf(1,3,1,5)
    )

    setZeroes(matrix1)
}