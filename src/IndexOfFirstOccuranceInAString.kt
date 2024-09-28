//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
fun strStr(haystack: String, needle: String): Int {
    val haystackLen = haystack.length
    val needleLen = needle.length

    for (i in 0..haystackLen-needleLen){
        if (haystack.substring(i, needleLen+i) == needle){
            return i
        }
    }
    return -1
}

fun main() {
    println(strStr("sadbutsad", "sad"))
    println(strStr("leetcode", "leeto"))
}