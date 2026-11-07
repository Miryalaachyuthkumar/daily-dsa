class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int ans [] = new int[n];
        for(int i = 0;i<n;i++)
        {
            int m = nums[i];
            int sum = 0;
            while(m>0)
            {
                sum+=m%10;
                m/=10;
            }
            ans[i] = sum;
        }
        int sol = Integer.MAX_VALUE;
        for(int x : ans)
        {
            sol = Math.min(x,sol);
        }
        return sol;
    }
}