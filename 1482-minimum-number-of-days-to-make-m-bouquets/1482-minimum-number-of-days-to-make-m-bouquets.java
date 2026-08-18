class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        
        if((long)m*k>n)
        {
            return -1;
        }
        
        int min = -1;
        for(int x : bloomDay)
        { 
            
            if(x>min)
            {
                min = x;
            }
        }
        int l = 1;
        int r = min;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(ans(mid,bloomDay,m,k))
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
        private boolean ans(int mi , int a[],int l,int t){
        
            int m = l;
            int c = 0;
            for(int x : a)
            {
                if(x <= mi)
                {
                    c++;
                }
                else
                {
                    c = 0;
                }
                if(c == t)
                {
                    m--;
                    c =0;
                }
                if(m == 0)
                {
                    return true;
                }
                
                    
            }
            return false;
        }
    
}