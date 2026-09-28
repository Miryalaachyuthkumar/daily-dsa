class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        } 
        int max = 0;
        for(int x : map.values())
        {
            max = Math.max(x,max);
        }
        int c = 0;
        for(int x : map.values())
        {
            if(max == x)
            {
                c+=x;
            }
        }
        
        return c;
    }
}