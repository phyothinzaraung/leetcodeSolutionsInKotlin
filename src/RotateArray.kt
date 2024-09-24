//https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
fun rotate(nums: IntArray, k: Int): Unit {
    val n = nums.size
    val k = k%n
    reverse(nums, 0, n-1)
    reverse(nums, 0, k-1)
    reverse(nums, k, n-1)

    println(nums.joinToString ())
}

fun reverse(nums: IntArray, start: Int, end: Int){
    var left = start
    var right = end
    while (left < right){
        val temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
        left++
        right--
    }
}

fun main() {
    rotate(intArrayOf(1,2,3,4,5,6,7), 3)
}