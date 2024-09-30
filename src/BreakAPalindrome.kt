fun breakPalindrome(palindrome: String): String {
    if(palindrome.length == 1) return ""
    val charArr = palindrome.toCharArray()
    for (i in 0 until charArr.size/2){
        if (charArr[i] != 'a'){
            charArr[i] = 'a'
            return String(charArr)
        }
    }
    charArr[charArr.size - 1] = 'b'
    return String(charArr)
}

fun main() {
    println(breakPalindrome("abccba"))
    println(breakPalindrome("aaa"))
}