class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long pre [] = new long[n];
        long sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = sum+nums[i];
            pre[i] = sum;
        }
        int c = 0;
        for(int i = 0;i<n-1;i++)
        {
            if(pre[i]>=pre[n-1]-pre[i])
            {
                c++;
            }
        }
        return c;

    }
}