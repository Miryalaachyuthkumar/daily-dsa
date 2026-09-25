class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0] - b[0]);
        List<List<Integer>> list = new ArrayList<>();
        int n = intervals.length;
        int l = intervals[0][0];
        int r = intervals[0][1];
        for(int i = 0;i<n-1;i++)
        {
            if(r>=intervals[i+1][0])
            {
                r = Math.max(r,intervals[i+1][1]);
            }
            else
            {
                list.add(Arrays.asList(l, r));
                l = intervals[i+1][0];
                r = intervals[i+1][1];
            }
        }
        list.add(Arrays.asList(l, r));
        int a[][] = new int[list.size()][2];
        for(int i = 0;i<list.size();i++)
        {
            for(int j = 0;j<2;j++)
            {
                a[i][j] = list.get(i).get(j);
            }
        } 
        return a;

    }
}