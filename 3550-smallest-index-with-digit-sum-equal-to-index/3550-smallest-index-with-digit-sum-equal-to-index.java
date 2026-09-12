class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int min  = Integer.MAX_VALUE;
        for(int i = 0 ;i<n;i++)
        {
            int sum = 0;
            int x = nums[i];
            while(x>0)
            {
                sum+=x%10;
                x/=10;
            }
            if(sum == i)
            {
                min = Math.min(i,min);
            }
        }
        if(min == 2147483647)
        {
            return -1;
        }
        return min;
    }
}