class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            set.add(x);
        }
        for(int i = 1;i<=2*n;i++)
        {
            if(!set.contains(i*k))
            {
                return i*k;
            }
        }
        return 0;
    }
}