package Matrix//https://leetcode.com/problems/spiral-matrix/?envType=study-plan-v2&envId=top-interview-150

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val output = mutableListOf<Int>()

    //row
    var top = 0
    var bottom = matrix.size - 1

    //column
    var left = 0
    var right = matrix[0].size - 1

    while (top <= bottom && left <= right){
        for (i in left..right){
            output.add(matrix[top][i])
        }
        top++
        for (i in top..bottom){
            output.add(matrix[i][right])
        }
        right--
        if (top <= bottom){
            for (i in right downTo left){
                output.add(matrix[bottom][i])
            }
            bottom--
        }
        if (left<=right){
            for (i in top downTo bottom){
                output.add(matrix[i][left])
            }
            left++
        }
    }
    return output
}

fun main() {

    println(
        spiralOrder(
        arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )
    )
    )
}