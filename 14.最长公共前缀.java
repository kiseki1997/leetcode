/*
 * @lc app=leetcode.cn id=14 lang=java
 *1：依次扫描所有字符串的0位，1位...直到有不同的或出现异常(3ms）
 
 * [14] 最长公共前缀
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuffer res = new StringBuffer();
        try {
            for (int i = 0; i < strs[0].length(); i++) {
                char c = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (c != strs[j].charAt(i)) {
                        return res.toString();
                    }
                }
                res.append(c);
            }
            return res.toString();
        } catch (Exception e) {
           return res.toString();
        }
    }
}
