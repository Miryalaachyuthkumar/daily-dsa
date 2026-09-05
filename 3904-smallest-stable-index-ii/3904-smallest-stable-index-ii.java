class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int p[] = new int[n];
        int s[] = new int [n];
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum+=nums[i];
            p[i] = sum;
        }
        int pm[] = new int[n];
        pm[0] = p[0];
        int max = p[0];
        for(int i = 1;i<n;i++)
        {
            if(p[i]-p[i-1]>max)
            {
                max = p[i]-p[i-1];
            }
            pm[i] = max;
        }
        int j = n-1;
        s[0] = sum;
        for(int i = 1;i<n;i++)
        {
           s[i] = sum-p[i-1];
        }
        int sm[] = new int[n];
        sm[n-1] = s[n-1];
        int min = s[n-1];
        for(int i = n-2;i>=0;i--)
        {
             if(s[i]-s[i+1]<min)
             {
                min = s[i]-s[i+1];
             }
             sm[i] = min;
        }
        for(int i = 0;i<n;i++)
        {
            if(pm[i]-sm[i]<=k)
            {
                return i;
            }
        }
return -1;
    }
}