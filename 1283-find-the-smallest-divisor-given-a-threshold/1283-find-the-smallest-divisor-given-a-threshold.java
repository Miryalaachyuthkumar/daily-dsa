class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 0;
        for(int i : nums)
        {
            r = Math.max(r,i);
        }
        int min = Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(ans(mid,threshold,nums))
            {
               min = Math.min(min,mid);
               r = mid-1;
            }
            else
            {
             l = mid+1;
            }
        }
        return min;


    }
    private boolean ans(int n, int t,int []a)
    {
        int sum = 0;
        int x = n;
        for(int  i : a)
        {
            sum+= (i+x-1)/x;
        }
        if(sum<=t)
        {
            return true;
        }
        return false;
    }
}