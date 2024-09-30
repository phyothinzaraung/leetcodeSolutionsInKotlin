//https://leetcode.com/problems/two-sum/description/?envType=study-plan-v2&envId=top-interview-150

fun twoSum(nums: IntArray, target: Int): IntArray {
    var map = hashMapOf<Int, Int>()
    for(i in 0 until nums.size){
        val secondElement = target - nums[i]
        if (map.containsKey(secondElement)){
            println(map[secondElement]!!)
            println(i)
            return intArrayOf(map[secondElement]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}

fun main() {
    twoSum(intArrayOf(2,7,11,15), 9)
}