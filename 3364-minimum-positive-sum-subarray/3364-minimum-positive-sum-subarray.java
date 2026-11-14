class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = nums.get(i);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++)
        {    int sum = 0;
            for(int j = i;j<n;j++)
            {
                int len = j-i+1;
                sum+=a[j];
                if(len>= l && len<=r)
                {
                    if(sum>0)
                    {
                       min = Math.min(min,sum);
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE )
        return -1;
        return min;
    }
}