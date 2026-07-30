class Solution {
    public int sumFourDivisors(int[] nums) {
        int tot = 0;
        int n = nums.length;
        for(int j = 0;j<n;j++)
        {      int c = 0;
               int s = 0;
            for(int i = 1;i*i<=nums[j];i++)
            {
                  if(nums[j]%i == 0 && i == nums[j]/i)
                  {
                     
                   
                        c++;
                        s+=i;
                    
                  }
                  else if (nums[j]%i == 0)
                  {
                    c+=2;
                    s = s+nums[j]/i+i;
                  }
            }
            if(c == 4)
            {
                tot += s;
            }
        }
        return tot;
    }
}