import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *1 使用栈
 2 使用char数组代替栈,不使用map
 * [20] 有效的括号
 */
class Solution {
    public boolean isValid(String s) {
        if (s.equals("")) {
            return true;
        }
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (top != -1) {
                if (stack[top] == '(' && c == ')') {
                    top -= 1;
                } else if (stack[top] == '[' && c == ']') {
                    top -= 1;
                } else if (stack[top] == '{' && c == '}') {
                    top -= 1;
                } else {
                    stack[++top] = c;
                }
            }else{
                stack[++top] = c;
            }
        }
        return top == -1;
    }
}
