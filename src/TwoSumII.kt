//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150

fun twoSumII(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1
    while (left < right){
        val sum = numbers[left] + numbers[right]
        if (target==sum){
            println(left+1)
            println(right+1)
            return intArrayOf(left+1, right+1)
        }
        else if(sum > target) right--
        else left++
    }
    return intArrayOf()
}

fun main() {
    twoSumII(intArrayOf(2,7,11,15), 9)
}