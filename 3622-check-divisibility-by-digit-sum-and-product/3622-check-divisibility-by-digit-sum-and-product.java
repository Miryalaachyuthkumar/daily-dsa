class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum = 0;
        while(t>0)
        {
            sum+=t%10;
            t/=10;
        }
        int x = n;
        int mul =1;
        while(x>0)
        {
            mul*=x%10;
            x/=10;
        }
        int re = sum+mul;
        if(n%re == 0)
        {
            return true;
        }
        return false;
    }
}