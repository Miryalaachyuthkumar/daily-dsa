class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int ans = 0;
        for(int i = 1;i<=min;i++)
        {
            if(min%i == 0 && max%i == 0)
            {
                ans = Math.max(i,ans);
            }
        }
        return ans;
    }
}