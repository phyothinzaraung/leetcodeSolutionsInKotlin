//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/1400993710/?envType=study-plan-v2&envId=top-interview-150

fun maxProfitII(prices: IntArray): Int {
    var profit = 0
    for(i in 1 until prices.size){
        if (prices[i] > prices[i-1]){
            profit += prices[i] - prices[i-1]
        }
    }
    return profit
}

fun main() {
    println(maxProfitII(intArrayOf(7,1,5,3,6,4)))
}