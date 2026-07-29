class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int add = duration;
        int n = timeSeries.length;
        for(int i = 0;i<n-1;i++)
        {
            int dif = timeSeries[i+1]-timeSeries[i];
            add+=Math.min(dif,duration);
        }
        return add;
    }
}