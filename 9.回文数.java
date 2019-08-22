/*
 * @lc app=leetcode.cn id=9 lang=java
 * 第一次：全部翻转后验证，溢出时一定不是回文数
 * 第二次：翻转一半数字后验证
 * [9] 回文数
 */
class Solution {
    public boolean isPalindrome(int x) {
        try {
            if (x < 0) {
                return false;
            }
            if (x == 0) {
                return true;
            }
            if (x % 10 == 0) {
                return false;
            }
            int rev = 0;
            while (x > rev) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }

            return x==rev||x==rev/10;
        } catch (Exception e) {
            return false;// 如果越界一定不是回文数
        }
    }

}
