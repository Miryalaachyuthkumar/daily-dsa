class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 1;
        int r = nums[n-1];
        int mid = 0;
        while(l<=r)
        {
            mid = l + (r-l)/2;
           if(ans(mid,nums,maxOperations))
           {
             r = mid-1;
           }
           else
           {
             l = mid+1;
           }
        }
        return l;
    }
    private boolean ans(int m,int a[],int op)
    {    long c = 0;
         for(int x : a)
         {
            c+= (x-1)/m;
         }
         if(c>op)
         {
            return false;
         }
         return true;
    }
}