//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-interview-150
fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n)
    var pre = 1
    var post = 1

    for (i in 0 until n){
        result[i] = pre
        pre *= nums[i]
    }

    for (i in n-1 downTo 0){
        result[i] *= post
        post *= nums[i]
    }
    return result
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val result = productExceptSelf(nums)
    println("Final Result: ${result.contentToString()}")
}