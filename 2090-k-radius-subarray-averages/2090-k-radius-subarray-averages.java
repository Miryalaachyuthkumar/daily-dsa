class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n];

        long sum = 0;
        long pre[] = new long[n];

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            pre[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            if (i < k || i >= n - k) {
                ans[i] = -1;
            }
        }

        for (int i = k; i < n - k; i++) {
            int le = i - k;
            int re = i + k;

            long windowSum;

            if (le == 0) {
                windowSum = pre[re];
            } else {
                windowSum = pre[re] - pre[le - 1];
            }

            ans[i] = (int) (windowSum / (2 * k + 1));
        }

        return ans;
    }
}