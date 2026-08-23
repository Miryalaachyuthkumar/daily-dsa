class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        String s = num.substring(0,n/2);
        String a = num.substring(n/2,n);
        int lc = 0;
        int lsum = 0;
        for(char x : s.toCharArray())
        {
            if(x == '?')
            {
                lc++;
            }
            else
            {
                lsum+= x -'0';
            }
        }
         int rc = 0;
         int rsum = 0;
        for(char x : a.toCharArray())
        {
            if(x == '?')
            {
                rc++;
            }
            else
            {
                rsum+= x -'0';
            }
        }
        int resum = (lsum-rsum);
        int rec = (lc-rc);

        return resum*2 != -rec*9;
    }
}