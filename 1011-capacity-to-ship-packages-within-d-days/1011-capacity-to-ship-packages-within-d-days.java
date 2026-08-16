class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        for(int i : weights)
        { 
            l = Math.max(l,i);
            r+=i;
        }
        while(l<=r)
        {
            int mid = l +(r-l)/2;
            if(ans(mid,weights,days))
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
    private boolean ans(int n,int []a,int d)
    {    int t = n;
         int c = 1;
         for(int x : a)
         {
            
            if(t>=x)
            {
                t-=x;
            }
            else
            {
                c++;
                t = n-x; 
            }
         }
         if(c <= d)
         {
            return true;
         }
         return false;
    }
    
}