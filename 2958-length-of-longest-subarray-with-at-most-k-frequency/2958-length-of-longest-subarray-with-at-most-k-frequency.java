class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r = 0;r<n;r++)
        {
           map.put(nums[r],map.getOrDefault(nums[r],0)+1);
          
            
            while(map.get(nums[r])>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l]) == 0)
                {
                    map.remove(nums[l]);
                }    
                l++;       
            }
           max = Math.max(max,r-l+1);

        }
        return max;
    }
}