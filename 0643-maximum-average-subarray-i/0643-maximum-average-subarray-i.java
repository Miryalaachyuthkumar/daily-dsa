class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double fwin = 0;
        
        for(int i = 0;i<k;i++)
        {
            fwin+=nums[i];

        }
        double awin = fwin/k;
        for(int i = k;i<nums.length;i++)
        {
            fwin = fwin - nums[i-k] + nums[i];
            awin = Math.max(awin,fwin/k);
        }
        return awin;
    }
}