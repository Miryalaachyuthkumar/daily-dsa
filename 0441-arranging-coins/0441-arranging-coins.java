class Solution {
    public int arrangeCoins(int n) {
        int c = 1;
        int k = 0;
        
        while(n>=c)
        {
            n = n -c;
            c++;
            k++;
        }
        return k;
    }
}