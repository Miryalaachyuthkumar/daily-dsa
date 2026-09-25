class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int c = 0;
        int n = intervals.length;
        int lend = intervals[0][1];
        int cstart ;
        for(int i = 1;i<n;i++)
        {   cstart = intervals[i][0];
            if(lend>cstart)
            {
                c++;
            }
            else
            {
                lend = intervals[i][1]; 
            }
        }
        return c;

    }
}