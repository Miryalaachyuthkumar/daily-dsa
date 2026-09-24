class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b)-> a[1]-b[1]);
        int r = pairs.length;
        int c = 0;
        int pr = Integer.MIN_VALUE;
        for(int i = 0;i<r;i++)
        {
             if (pairs[i][0] > pr) {
                c++;
                pr = pairs[i][1];
            }
        }
        return c;
    }
}