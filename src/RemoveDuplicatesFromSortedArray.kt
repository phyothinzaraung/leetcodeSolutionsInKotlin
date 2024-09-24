//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
fun removeDuplicates(nums: IntArray): Int {
    var k = 1
    for (i in 1 until nums.size){
        if (nums[i-1] != nums[i]){
            nums[k] = nums[i]
            k++
        }
    }
    return k
}

fun main(){
    val nums = intArrayOf(1,1,2)
    println(removeDuplicates(nums))
}