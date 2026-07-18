class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        
        int a[] = new int[n];
        for(int i = 1;i<=n;i++)
        {
            a[i-1] = i; 
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            if(!(set.contains(nums[i])))
            {
                   set.add(nums[i]);
            }
        }
        
        
       for(int x : a)
          {
                if(!set.contains(x))
            {
                list.add(x);
            }
            }
        return list;
    }
}