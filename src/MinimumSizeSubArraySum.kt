//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var size = Int.MAX_VALUE
    var left = 0
    var sum = 0
    for (right in 0 until nums.size){
        sum += nums[right]
        while (sum >= target){
            size = minOf(size, right - left + 1)
            sum -= nums[left]
            left++
        }
    }
    return if (size == Int.MAX_VALUE) 0 else size
}

fun main() {
    println(minSubArrayLen(7, intArrayOf(2,3,1,2,4,3)))
}