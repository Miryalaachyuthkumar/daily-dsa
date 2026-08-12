class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int c = 0;
        for(int x : nums)
        {
            String s = String.valueOf(x);
            if(s.length()%2 == 0)
            {
                c++;
            }

        }
        return c;
    }
}