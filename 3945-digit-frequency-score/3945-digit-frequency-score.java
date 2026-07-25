class Solution {
    public int digitFrequencyScore(int n) {
        int a[] = new int[10];
        int sum = 0;
        while(n>0)
        {
            int x = n%10;
            a[x]++;
            n/=10;
        }
        for(int i = 0;i<a.length;i++)
        {
            sum = sum + i*a[i];
        }
        return sum;
    }
}