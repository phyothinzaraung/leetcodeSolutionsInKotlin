//https://leetcode.com/problems/happy-number/description/

fun isHappy(n: Int): Boolean {
    var num = n
    val set = mutableSetOf<Int>()
    while (true){
        var sum = 0
        while (num != 0){
            val r = num % 10
            num /= 10
            sum += r * r
        }
        if (sum == 1) return true
        num = sum
        if (set.contains(num)) return false
        set.add(num)
    }
}

fun main() {
    println(isHappy(19))
    println(isHappy(2))
}