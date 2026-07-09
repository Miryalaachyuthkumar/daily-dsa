class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        for(int x : nums)
        {
            total+=x;
        }
        int l = 0;
        for(int i = 0;i<nums.length;i++)
        {
            int r = total-l-nums[i];
            if(r == l)
            {
                  return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}