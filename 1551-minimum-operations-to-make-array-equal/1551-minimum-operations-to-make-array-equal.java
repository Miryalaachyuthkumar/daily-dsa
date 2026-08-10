class Solution {
    public int minOperations(int n) {
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            a[i] = 2*i+1;
            sum+=a[i];
        }
        int t = sum/n;
        int fina = 0;
        for(int x : a)
        {
            if(x>t)
            {
                fina+=x-t;
            }
        }
        return fina;

    }
}