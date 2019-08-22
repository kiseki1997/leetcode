/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 * 不断取出最后一位放在最前面,同时验证是否溢出
 */
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > 2147483647 / 10 || (rev == 2147483647 / 10 && pop > 7)) {
                return 0;
            }
            if (rev < -2147483648 / 10 || (rev == -2147483648 / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
