package SlidingWindow//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

fun lengthOfLongestSubstring(s: String): Int {
    var len = 0
    var index = 0
    val set = mutableSetOf<Char>()

    for (i in 0 until s.length){
        while (set.contains(s[i])){
            set.remove(s[index++])
        }
        set.add(s[i])
        len = maxOf(len, set.size)
    }
    return len
}

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
    println(lengthOfLongestSubstring("pwwkew"))
}