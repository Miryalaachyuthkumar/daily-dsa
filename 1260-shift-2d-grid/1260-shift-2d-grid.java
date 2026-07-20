class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> list = new ArrayList<>();
        int a[] = new int[n*m];
        int b[] = new int[n*m];
        int l = 0;
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++){
                a[l++] = grid[i][j];
            }
        }
        
        for(int i = 0;i<a.length;i++)
        {
            b[(i+k)%(n*m)] = a[i];
        }
        int id = 0;
        for(int i = 0;i<m;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j<n;j++)
            {
                row.add(b[id++]);
            }
            list.add(row);
        }
        return list;
    }
}