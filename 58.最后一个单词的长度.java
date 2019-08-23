/*
 * @lc app=leetcode.cn id=58 lang=java
 *1:从最后开始查找最后一个字母
 * [58] 最后一个单词的长度
 * 注意for和while的区别！！
 */
class Solution {
    public int lengthOfLastWord(String s) {
        if (s.equals("")) {
            return 0;
        }
       int end = s.length()-1;

        while(end>=0&&s.charAt(end)==' '){
            end--;
        }
        if(end<0){
            return 0;
        }
        int start = end;
        while(start>=0&&s.charAt(start)!=' '){
            start--;
        }
        return end - start;
    }
}
