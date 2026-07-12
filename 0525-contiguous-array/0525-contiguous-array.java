class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum+=(nums[i] == 0 ? -1 : 1);
            if(map.containsKey(sum))
            {
               int pr = map.get(sum);
               int l = i - pr;
               ans = Math.max(l,ans);
            }
            else
            {
                map.put(sum,i);
            }
        }
       return ans;
    }
}