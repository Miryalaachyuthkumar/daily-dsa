class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int []a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = points[i][0];
        }
        Arrays.sort(a);
        int max = 0;
        for(int i = 0;i<n-1;i++)
        {  int j = i+1;
           max = Math.max(max,(a[j]-a[i]));
        }
        return max;
    }
}