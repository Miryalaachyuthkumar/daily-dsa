class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = Math.abs(nums[i]);
        }
        Arrays.sort(a);
        long sum = 0;
        int x = n/2;
        for(int i = 0;i<n;i++)
        {
            sum+=a[i]*a[i];
        }
        long sub = 0;
        for(int i = 0 ;i<x;i++)
        {
           sub+=a[i]*a[i];
        }
        return sum-2*sub;
    }
}