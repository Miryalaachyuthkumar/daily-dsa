class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = ((n)*(n+1))/2;
        int x = 0,j = 0;
        Arrays.sort(nums);
        for(int i = 0;i<n;i++)
        {
            x+=nums[i];
            
        }
        for(int i = 0;i<n-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                j = i;
                break; 
            }
        }
        int a[] = new int[2];
        a[0] = nums[j];
        a[1] = nums[j]+sum-x;
      return a;
    }
    
}