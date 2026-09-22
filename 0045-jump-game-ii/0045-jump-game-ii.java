class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n<=1)
        {
            return 0;
        }
        int x = 0;
        int k = nums[0];
       int  maxr = 0+nums[0];
        int c = 1;
        int l = 0,m = 0;
        
        if(maxr >= n-1)
        {
            return c;
        }
        while(maxr<n-1)
        {
            for(int j = x+1;j<=Math.min(x+k,n-1);j++)
            {
                  if(maxr<j+nums[j])
                  {
                    maxr = j+nums[j];
                    l = j;
                    m = nums[j];
                  }
            }
            c++;
            
            
                x = l;
                k = m;
        }
        return c;
    }
}