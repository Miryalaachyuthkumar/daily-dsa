class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int val = 0;
       if(n%2 == 0)
       {
             int x = n/2;
             val = (nums[x]+nums[x-1])/2;
       }
       else
       {
           int x = n/2;
           val = nums[x];
       }
       int m = 0;
       for(int x : nums)
       {
          m+=Math.abs(x-val);
       }
       return m;
    }
}