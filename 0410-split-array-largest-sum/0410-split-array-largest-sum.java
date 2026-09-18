class Solution {
    public int splitArray(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        long sum = 0;

        for(int x : nums)
        {
            sum += x;

            if(x > max)
            {
                max = x;
            }
        }

        long l = max;
        long r = sum;

        while(l < r)
        {
            long mid = l + (r - l) / 2;

            if(check(nums, k, mid))
            {
                r = mid;
            }
            else
            {
                l = mid + 1;
            }
        }

        return (int)l;
    }

    private boolean check(int nums[], int k, long maxv)
    {
        int suba = 1;
        long cur = 0;

        for(int x : nums)
        {
            if(cur + x > maxv)
            {
                suba++;
                cur = x;

                if(suba > k)
                {
                    return false;
                }
            }
            else
            {
                cur += x;
            }
        }

        return true;
    }
}