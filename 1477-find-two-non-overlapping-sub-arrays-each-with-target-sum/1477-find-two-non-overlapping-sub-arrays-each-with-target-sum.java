class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int sum = 0;
        int l = 0;
        int n = arr.length;

        int[] best = new int[n];

        int INF = 1000000;
        int ans = INF;

        for (int i = 0; i < n; i++) {
            best[i] = INF;
        }

        for (int r = 0; r < n; r++) {

            sum += arr[r];

            
            while (sum > target) {
                sum -= arr[l];
                l++;
            }

            if (sum == target) {

                int len = r - l + 1;

                
                if (l > 0 && best[l - 1] != INF) {
                    ans = Math.min(ans, len + best[l - 1]);
                }

                
                if (r == 0) {
                    best[r] = len;
                } else {
                    best[r] = Math.min(best[r - 1], len);
                }

            } else {

                
                if (r > 0) {
                    best[r] = best[r - 1];
                }
            }
        }

        return ans == INF ? -1 : ans;
    }
}