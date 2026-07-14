class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
       int r [] = new int[nums.length];
       int l [] = new int[nums.length];
        r[n-1] = nums[n-1];
        l [0] = nums[0];
       for(int i = n-2;i>=0;i--)
       {
            r[i] = Math.min(nums[i],r[i+1]);
       }
       for(int i = 1;i<n;i++)
       {
           l[i] = Math.max(nums[i],l[i-1]);
       }
       
       for(int i = 0;i<n-1;i++)
       {
           if(l[i]<=r[i+1])
           {
             return i+1;
           }
           
       }
        return -1;
            
    }
}