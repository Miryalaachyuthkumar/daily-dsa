class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<n-2;i++)
        {
            for(int j = i+1;j<n-1;j++)
            {
                int l = j+1;
                int r = n-1;
                while(l<r)
                {
                    long sum = (long) nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum == target)
                    {
                        set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                    }
                    if(sum<target)
                    {
                           l++;
                    }
                    if(sum>target)
                    {
                        r--;
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}