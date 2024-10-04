package ArrayOrString//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit{
    var p1 = m - 1
    var p2 = n - 1
    var p = m + n - 1

    while (p1 >=0 && p2 >= 0){
        if(nums1[p1] > nums2[p2]){
            nums1[p] = nums1[p1]
            p1--
        }else{
            nums1[p] = nums2[p2]
            p2--
        }
        p--
    }

    while (p2 >= 0){
        nums1[p] = nums2[p2]
        p2--
        p--
    }
}

fun main(){
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3

    merge(nums1, m, nums2, n)
    println(nums1.joinToString())
}