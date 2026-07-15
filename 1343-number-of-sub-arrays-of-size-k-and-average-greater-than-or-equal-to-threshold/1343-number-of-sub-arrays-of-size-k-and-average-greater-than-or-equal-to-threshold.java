class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c = 0;
        int fsum = 0;
        for(int i = 0;i<k;i++)
        {
            fsum+=arr[i];
        }
        if(fsum>= threshold*k )
        {
            c++;
        }
        for(int i = k;i<arr.length;i++)
        {
            fsum = fsum - arr[i-k]+arr[i];
            if(fsum>=threshold*k)
            {
                c++;
            }
        }
        return c;
    }
}