class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int pre[] = new int[n];
        int x = 0;
        for(int i = 0;i<n;i++)
        { 
            x += cardPoints[i];
            pre[i]  = x; 
        }
         int max = 0;
         for(int l = 0;l<=k;l++)
         {
            int r = k -l;
            int lsum = 0; 
            if(l>0)
            {
               lsum = pre[l-1];
            }
            int rsum =0 ;
            if(r>0)
            {
            if(r == n)
            {
                rsum = pre[n-1];
            }
            else
            {
                rsum = pre[n-1]-pre[n-r-1];
            }
            }
            max = Math.max(max,rsum+lsum);
         }
         return max;
    }
}