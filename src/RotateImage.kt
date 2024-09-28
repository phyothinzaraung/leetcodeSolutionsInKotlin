//https://leetcode.com/problems/rotate-image/description/?envType=study-plan-v2&envId=top-interview-150

fun rotate(matrix: Array<IntArray>): Unit {
    val matrixSize = matrix.size
    for (row in 0 until matrixSize){
        for (col in row until matrixSize){
            val temp = matrix[row][col]
            matrix[row][col] = matrix[col][row]
            matrix[col][row] = temp
        }
    }

    for (i in 0 until matrixSize){
        matrix[i].reversedArray()
    }

    printMatrix(matrix)
}

fun IntArray.reversedArray(){
    var left = 0
    var right = this.size - 1
    while (left < right){
        val temp = this[left]
        this[left] = this[right]
        this[right] = temp
        left++
        right--
    }
}

fun main() {
    rotate(arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    ))
}