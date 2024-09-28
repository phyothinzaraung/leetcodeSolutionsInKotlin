//https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    var totalGas = 0
    var totalCost = 0
    var startPosition = 0
    var tank = 0
    for (i in 0 until gas.size){
        totalGas += gas[i]
        totalCost += cost[i]
        tank += gas[i] - cost[i]
        if (tank < 0){
            startPosition = i + 1
            tank = 0
        }
    }
    return if (totalGas >= totalCost) startPosition else -1
}

fun main() {
    println(canCompleteCircuit(intArrayOf(1,2,3,4,5), intArrayOf(3,4,5,1,2)))
}