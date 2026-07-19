class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0;
        int n = nums.length;
        int mul = 1;
        int l = 0;
        if(k<=1)
        {
            return 0;
        }
        for(int r = 0;r<n;r++)
        {
            
            mul *= nums[r];
            
            while(mul>=k)
            { 
                mul/=nums[l];
                l++;

            }
            c += r-l+1;

        }
        return c;
    }
}