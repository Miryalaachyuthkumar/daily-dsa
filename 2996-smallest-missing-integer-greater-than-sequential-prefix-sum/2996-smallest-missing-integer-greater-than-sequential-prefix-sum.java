class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i = 1;i<n;i++)
        {
            if(nums[i-1]+1 == nums[i])
            {
                sum+=nums[i];
            }
            else
            {
                break;
            }
        }
        Arrays.sort(nums);
        int re = sum;
        if(nums[n-1]<re)
        {
            return re;
        }
        else
        {
            for(int x : nums)
            {
                if(x == re)
                {
                    re++;
                }
                else if(x>re)
                {
                    return re;
                }
            }
        }
        return re;
    }
}