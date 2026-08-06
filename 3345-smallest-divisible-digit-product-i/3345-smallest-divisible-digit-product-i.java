class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n;i<=100;i++)
        {    int  j = i;
            int mul = 1;
            while(j>0)
            {
                mul*=j%10;
                j/=10;
            }
            if(mul%t == 0)
            {
                return i;
            }
        }
        return 0;
    }
}