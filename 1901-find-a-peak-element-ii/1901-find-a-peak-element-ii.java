class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = 0;
        int r = mat.length-1;
        int n = mat.length;
        int co = mat[0].length;
        

        while(l<=r)
        {
            int mid = l+(r-l)/2;
            int max = 0;
            int i = mid;
            int j = 0;
            for(int k = 0;k<co;k++)
            {
                if(mat[mid][k]>max)
                {
                   max = mat[mid][k];
                   j = k;
                }
            }
            if (i - 1 >= 0 && mat[i - 1][j] > mat[i][j]) {
                r = mid - 1;
            }

            
            else if (i + 1 < n && mat[i + 1][j] > mat[i][j]) {
                l = mid + 1;
            }

            
            else {
                return new int[]{i, j};
            }

        }
        return new int[]{-1,-1};
    }
}