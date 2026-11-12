class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int n = nums.length;
        int in = 1 , de = 1;
        for(int i = 1;i<n;i++)
        { 
             if(nums[i-1]<nums[i])
             {
                in++;
                de = 1;
             }
             else if(nums[i-1]>nums[i])
             {
                in = 1;
                de ++;
             }
             else
             {
                in = 1;
                de = 1;
             }
             max = Math.max(max,Math.max(in,de));
        }
        return max;
    }
}