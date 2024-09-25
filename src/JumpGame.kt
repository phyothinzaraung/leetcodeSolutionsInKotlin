//https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
fun canJump(nums: IntArray): Boolean {
    var maxReach = 0
    val n = nums.size

    for (i in 0 until n){
        if(i > maxReach) return false
        maxReach = maxOf(maxReach, i + nums[i])
        if(maxReach >= n-1) return true
    }

    return false
}

fun main() {
    println(canJump(intArrayOf(3,2,1,0,4)))
    println(canJump(intArrayOf(2,3,1,1,4)))
}