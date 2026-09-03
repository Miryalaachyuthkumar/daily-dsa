class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        int r = Integer.MIN_VALUE;
        for(int x : candies)
        {
           sum+=x;
           r = Math.max(r,x);
        }
        if(sum < k)
        {
            return 0;
        }
        int n = candies.length;
        int l = 1;
        
        long c = 0;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
             for(int x : candies)
             {
                if(x>=mid)
                {
                   c+=x/mid;
                }
             }
                
                 if(c>=k)
                {
                    l = mid+1;
                }
                else
                {
                    r = mid-1;
                }
            c = 0; 
             
        }
        return r;
      
    }
}