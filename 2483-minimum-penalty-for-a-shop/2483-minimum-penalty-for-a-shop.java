class Solution {
    public int bestClosingTime(String customers) {
        
        int n = customers.length();
        int sn [] = new int[n];
        int c = 0;
        int py[] = new int[n]; 
        for(int i = n-1;i>=0;i--)
        {
            if( customers.charAt(i) == 'Y')
            {
                c++;
            }
            sn[i] = c;
        }
        int b = 0;
        for(int i = 0;i<n;i++)
        {    py[i] = b;
            if( customers.charAt(i) == 'N')
            {
                b++;
            }
            
        }
        int min1 = Integer.MAX_VALUE;
        int finmin = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++)
        {
            int sum = sn[i]+py[i];
            if(min1>sum)
            { 
                min1 = sum;
                finmin = i;
            }
        }
        if(b<min1)
        {
            finmin = n;
        }
     return finmin;
    }
}