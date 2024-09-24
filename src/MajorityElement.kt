//https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
fun majorityElement(nums: IntArray): Int {
    var element = nums[0]
    var count = 1
    for (i in 1 until nums.size){
        if (count == 0){
            element = nums[i]
            count = 1
        }else if(nums[i] == element){
            count++
        }else{
            count--
        }
    }
    return element
}

fun main() {
    println(majorityElement(intArrayOf(3,2,3)))
}