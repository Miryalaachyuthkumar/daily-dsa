class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<=n-k;i++)
        {  HashSet<Integer> set = new HashSet<>();
            for(int j = i;j<k+i;j++)
            {
                set.add(nums[j]);
            }
            for(int x : set)
            {
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        int max = -1;
        for(int i = 0;i<n;i++)
        {
            if(map.get(nums[i]) == 1 && max < nums[i])
            {
                max = nums[i];
            }
        }
        
        return max;
    }
}