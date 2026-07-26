class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mul = nums[n-1]*nums[n-2]*nums[n-3];
        int mul2 = nums[n-1]*nums[0]*nums[1];
        int max = Math.max(mul,mul2);
        return max;
    }
}