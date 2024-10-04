import java.util.Stack

//https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (ch in s){
        when(ch){
            '(', '{', '[' -> stack.add(ch)
            ')' -> if (stack.isEmpty() || stack.pop()!='(') return false
            '}' -> if (stack.isEmpty() || stack.pop()!='{') return false
            ']' -> if (stack.isEmpty() || stack.pop()!='[') return false
        }
    }
    return stack.isEmpty()
}

fun main() {
    println(isValid("()"))
    println(isValid("(]"))
}