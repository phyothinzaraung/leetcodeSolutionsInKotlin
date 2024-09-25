//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
fun maxProfit(prices: IntArray): Int{
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0
    for (price in prices){
        minPrice = minOf(price, minPrice)
        val profit = price - minPrice
        maxProfit = maxOf(profit, maxProfit)
    }
    return maxProfit
}

fun main() {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
    println(maxProfit(intArrayOf(7,6,4,3,1)))
}