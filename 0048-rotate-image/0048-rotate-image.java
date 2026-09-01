class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int a[][] = new int[r][r];
        for(int i = 0;i<r;i++)
        {      int c = 0;
            for(int j = r-1;j>=0;j--)
            {
                a[i][c] = matrix[j][i];
                c++;
            }
        }
        for(int i = 0;i<r;i++)
        {      
            for(int j = 0;j<r;j++)
            {
                 matrix[i][j] = a[i][j];
                
            }
        }
    }
}