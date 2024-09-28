//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150

fun isSubsequence(s: String, t: String): Boolean {
    var sIndex = 0
    var tIndex = 0
    while (sIndex < s.length && tIndex < t.length){
        if (s[sIndex] == t[tIndex]){
            sIndex++
        }
        tIndex++
    }
    return sIndex == s.length
}

fun main() {
    println(isSubsequence("abc", "ahbgdc"))
    println(isSubsequence("axc", "ahbgdc"))
}