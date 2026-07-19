class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int n = s.length();
        int max = 0;
        int mmax = 0;
        int[] a = new int[26];

        for (int r = 0; r < n; r++) {

            a[s.charAt(r) - 'A']++;

            max = Math.max(max, a[s.charAt(r) - 'A']);

            if ((r - l + 1) - max > k) {
                a[s.charAt(l) - 'A']--;
                l++;
            }

            mmax = Math.max(mmax, r - l + 1);
        }

        return mmax;
    }
}
