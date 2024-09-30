//https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150

fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false
    var map = mutableMapOf<Char, Int>()
    for (ch in s){
        map[ch] = map.getOrDefault(ch, 0) + 1
    }

    for (ch in t){
        if (!map.containsKey(ch) || map[ch]!! <= 0) return false
        map[ch] = map[ch]!! - 1
    }

    return true
}

fun main() {
    println(isAnagram("anagram", "nagaram"))
    println(isAnagram("rat", "car"))
}