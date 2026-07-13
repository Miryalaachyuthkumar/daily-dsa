class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> se = new HashSet<>();
         int l = 0;
         
         Arrays.sort(nums);
         for(int i = 0;i<nums.length-2;i++)
         {     int r = nums.length-1;
                l = i+1;
            while(l<r)
            {
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0)
                {
                       se.add(Arrays.asList(nums[i],nums[l],nums[r]));
                       l++;
                       r--;
                }
                
                 
                
                if(sum>0)
                {
                    r--;
                }
                if(sum<0)
                {
                    l++;
                }
            }
         }
         return new ArrayList<>(se);
    }
}