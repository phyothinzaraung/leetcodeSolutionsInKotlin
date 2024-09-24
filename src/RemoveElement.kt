//https://leetcode.com/problems/remove-element/

fun removeElement(nums: IntArray, `val`: Int): Int{
    var k = 0
    for(num in nums){
        if (num != `val`){
            nums[k] = num
            k++
        }
    }
    return k
}

fun main(){
    val nums = intArrayOf(3,2,2,3)
    val removeEle = 3
    println(removeElement(nums, removeEle))
}