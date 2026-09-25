class Solution {

    public int kConcatenationMaxSum(int[] arr, int k) {

        long MOD = 1000000007;

        long sum = 0;

        for (int x : arr) {
            sum += x;
        }

        
        long max = 0;
        long cursum = 0;

        for (int x : arr) {
            cursum = Math.max(0, cursum + x);
            max = Math.max(max, cursum);
        }

        
        if (k == 1) {
            return (int)(max % MOD);
        }

        
        long presum = 0;
        long temp = 0;

        for (int x : arr) {
            temp += x;
            presum = Math.max(presum, temp);
        }

        
        long sufsum = 0;
        temp = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            temp += arr[i];
            sufsum = Math.max(sufsum, temp);
        }

        long ans;

        if (sum > 0) {
            ans = Math.max(max, presum + sufsum + (k - 2) * sum);
        } else {
            ans = Math.max(max, presum + sufsum);
        }

        return (int)(ans % MOD);
    }
}