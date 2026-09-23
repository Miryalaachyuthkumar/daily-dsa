class Solution {
    public int minOperations(int[] nums, int x) {
        int s = 0;
        for(int l : nums)
        {
            s+=l;
        }
        if(s<x)
    {
        return -1;
    }
    if(s == x)
    {
        return nums.length;
    }
        int ans = s-x;
        int l = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int j = 0;
        for(int r = 0;r<nums.length;r++)
        {
             sum+=nums[r];
            while (sum >ans) {
                sum -= nums[l];
                l++;
            }

            
            if (sum == ans) {
                max = Math.max(max, r - l + 1);
            }
        }
        if(max == Integer.MIN_VALUE)
        {
            return -1;
        }
        return nums.length-max;

    }
}