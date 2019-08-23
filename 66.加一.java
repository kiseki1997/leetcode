/*
 * @lc app=leetcode.cn id=66 lang=java
 *注意进位
 
 * [66] 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        //若所有位数全部为0，则加一位1
        int[] res = new int[digits.length+1];
        res[0]=1;//未赋值的默认为0；
        return res;
    }
}

