class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
       int max = 0;
       int l = 0;
       int z = 0;
       for(int r = 0;r<n;r++)
       {   
           if(nums[r] == 0)
           {
            z++;
           }
         
        
         if(z>k)
         {
           while(z>k)
           {
             if(nums[l] == 0)
             {
                z--;
             }
             l++;
            }
         }
          max = Math.max(max,r-l+1);
       }
       return max;
    }
}