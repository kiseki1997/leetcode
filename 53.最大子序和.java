/*
 * @lc app=leetcode.cn id=53 lang=java
 * 动态规划
 * [53] 最大子序和
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num:nums){
            if(sum>0){
                sum+=num;
            }else{
                sum = num;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}

