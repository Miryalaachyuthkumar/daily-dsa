class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int n = piles.length;
        Arrays.sort(piles);
        int r = piles[n-1];
        int min = Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
             long c = 0;
            for(int i = 0;i<n;i++)
            {
                c+= (piles[i]+mid-1)/mid;
            }
            if( c<=h)
            {
                r = mid-1;
                min = Math.min(min,mid);
            }
            else
            {
                l = mid+1;
            }

        }
     return min;
    }
}