class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l = 1;
        Arrays.sort(time);
        long r = (long )time[0]*totalTrips;
        int n = time.length;
        long min = Long.MAX_VALUE;
        while(l<=r)
        {
            long mid = l+(r-l)/2;
            if(ans(mid,time,totalTrips))
            {   
                min = mid;
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return min;
    }
    private boolean ans(long o,int[] a, int k)
    {
          long c = 0;
          int x = a.length;
          for(int i = 0;i<x;i++)
          {
              c+=o/a[i];
          }
          if(c>=k)
          {
            return true;
          }
          return false;
    }
}