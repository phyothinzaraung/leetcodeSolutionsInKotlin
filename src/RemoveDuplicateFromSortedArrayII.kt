//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

fun removeDuplicatesII(nums: IntArray): Int{
    var k = 1
    var duplicateCount = 1

    for (i in 1 until nums.size){
        if (nums[i] == nums[i-1]){
            duplicateCount++
        }else{
            duplicateCount = 1
        }

        if (duplicateCount < 3){
            nums[k] = nums[i]
            k++
        }
    }
    return k
}

fun main(){
    val nums = intArrayOf(1,1,1,2,2,3)
    println(removeDuplicatesII(nums))
}

