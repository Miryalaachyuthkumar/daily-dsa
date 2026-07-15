class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int wr = 2;
        
        for(int i = 2;i<n;i++)
        {
            if(nums[wr-2] != nums[i])
            {
                nums[wr] = nums[i];
                wr++;
                
            }
        }
        return wr;
    }
}