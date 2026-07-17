class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MAX_VALUE;
        for(int  i = 0;i<n;i++)
        {    int b = 0;
            for(int j = i;j<n;j++)
            {
                 b |=nums[j];
                 if(b>=k)
                 {
                    max = Math.min(max,j-i+1);
                 }   
            }
        }
        if(max == Integer.MAX_VALUE )
        {
            return -1;
        }
        return max;
    }
}