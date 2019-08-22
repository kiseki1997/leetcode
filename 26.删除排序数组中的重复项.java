/*
 * @lc app=leetcode.cn id=26 lang=java
 *使用双指针
 * [26] 删除排序数组中的重复项
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length ==0) {
            return 0;
        }
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i++;
    }
}
