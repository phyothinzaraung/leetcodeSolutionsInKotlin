//https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
fun jumpII(nums: IntArray): Int {
    var jumps = 0
    var far = 0
    var end = 0
    for (i in 0 until nums.size - 1){
        far = maxOf(far, i+nums[i])
        if (i == end){
            jumps += 1
            end = far
        }
    }
    return jumps
}

fun main() {
    println(jumpII(intArrayOf(2,3,1,1,4)))
    println(jumpII(intArrayOf(2,3,0,1,4)))
}