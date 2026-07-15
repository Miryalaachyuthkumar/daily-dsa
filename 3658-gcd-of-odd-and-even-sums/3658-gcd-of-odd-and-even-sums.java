class Solution {
    public int gcdOfOddEvenSums(int n) {
        int en = 2*n;
        int on = 2*n-1;

        int esum = 0;
        int osum = 0;
        for(int i = 1;i<=on;i+=2)
        {
              osum+=i;
        }
        for(int i = 2;i<=en;i+=2)
        {
              esum+=i;
        }
        
        int min = Math.min(esum,osum);
        int ans = 0;
        for(int i =1 ;i<=min;i++)
        {
            if(esum%i == 0 && osum%i ==0)
            {
                ans = Math.max(i,ans);
            }
        }
    return ans;
    }
}