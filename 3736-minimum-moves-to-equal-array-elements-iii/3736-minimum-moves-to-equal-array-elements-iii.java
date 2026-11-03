class Solution {
    public int minMoves(int[] nums) {
        int num = 0;
        for(int x : nums)
        {
            num = Math.max(x,num);
        }
        int sum = 0;
        for(int x : nums)
        {
            sum  = sum + num-x;
        }
        return sum;
    }
}