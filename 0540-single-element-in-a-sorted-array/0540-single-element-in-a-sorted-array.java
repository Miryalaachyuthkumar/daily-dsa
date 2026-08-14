class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(nums.length == 1)
        {
            return nums[0];
        }
        for(int i = 1;i<n-1;i++)
        {
            int k = i-1;
            int j = i+1;
            if(nums[k] != nums[i] && nums[j] != nums[i])
            {
                return nums[i];
            }
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }

        return nums[n - 1];
    }
}