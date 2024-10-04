//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices){
        val num = nums[i]
        if (num in map && i - map[num]!! <= k){
            return true
        }
        map[num] = i
    }
    return false
}

fun main() {
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1), 3))
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 2))
}