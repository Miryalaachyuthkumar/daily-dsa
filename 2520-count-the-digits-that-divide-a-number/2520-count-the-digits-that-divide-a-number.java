class Solution {
    public int countDigits(int num) {
        int c = 0;
        int x = num;
        while(x>0)
        {
            int n = x%10;
            if(num%n == 0)
            {
                c++;
            }
            x/=10;
        }
        return c;
    }
}