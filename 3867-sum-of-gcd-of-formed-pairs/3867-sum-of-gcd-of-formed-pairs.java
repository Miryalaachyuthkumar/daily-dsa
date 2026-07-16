class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int gcda [] = new int[n];
        gcda [0] = nums[0];
        int max = nums[0];
        for(int i = 1;i<n;i++)
        {
            max = Math.max(max,nums[i]);
             int a = nums[i];
             int b = max;
             while(b!=0)
             {
                int t = b;
                b = a%b;
                a = t;
             }
             gcda[i] = a;
        }
        Arrays.sort(gcda);
        int l = 0;
        int r = n-1;
        long sum = 0;
        while(l<r)
        {
            int a = gcda[l];
            int b = gcda[r];
            while(b!=0)
            {
                int t = b;
                b = a%b;
                a = t;
            }
            sum+=a;
            l++;
            r--;
        }
      return sum;
    }
}