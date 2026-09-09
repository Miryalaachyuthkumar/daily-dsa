class Solution {
    public long countCommas(long n) {

        long ans = 0;

        if (n >= 1000) {
            ans += Math.min(n, 999_999L) - 1000 + 1;
        }

        if (n >= 1_000_000) {
            ans += 2 * (Math.min(n, 999_999_999L) - 1_000_000 + 1);
        }

        if (n >= 1_000_000_000L) {
            ans += 3 * (Math.min(n, 999_999_999_999L) - 1_000_000_000L + 1);
        }

        if (n >= 1_000_000_000_000L) {
            ans += 4 * (Math.min(n, 999_999_999_999_999L) - 1_000_000_000_000L + 1);
        }

        if (n >= 1_000_000_000_000_000L) {
            ans += 5 * (n - 1_000_000_000_000_000L + 1);
        }

        return ans;
    }
}