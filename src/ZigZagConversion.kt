//https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    var index = 0
    var goDown = false
    var outputArr = Array(numRows){StringBuilder()}

    for (ch in s){
        outputArr[index].append(ch)
        if (index == 0 || index == numRows-1) goDown = !goDown
        if (goDown) index++
        else index--
    }

    val result = StringBuilder()
    for (str in outputArr){
        result.append(str)
    }
    return result.toString()
}

fun main() {
    println(convert("PAYPALISHIRING", 3))
}