class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        long a[] = new long[n];
        a[0] = arr[0];
        for(int i = 1;i<n;i++)
        {
            a[i] = a[i-1]+arr[i];
        }
        long o = 0;
        long e = 1;
        for(long x : a)
        {
            if(x%2 == 0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        long total = (e*o)%1000000007;;
        return (int)total;
    }
}