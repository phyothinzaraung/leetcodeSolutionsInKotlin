//https://leetcode.com/problems/3sum/description/?envType=study-plan-v2&envId=top-interview-150

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()

    for (i in nums.indices){
        if (i>0 && nums[i] == nums[i-1]) continue

        var j = i+1
        var k = nums.size - 1

        while (j < k){
            val sum = nums[i] + nums[j] + nums[k]
            when{
                sum == 0 -> {
                    result.add(listOf(nums[i], nums[j], nums[k]))
                    while (j < k && nums[j] == nums[j+1]) j++
                    while (j < k && nums[k] == nums[k-1]) k--
                    j++
                    k--
                }
                sum < 0 -> j++
                else -> k--
            }
        }
    }

    return result
}

fun main() {
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
    val result = threeSum(nums)
    println(result)
}