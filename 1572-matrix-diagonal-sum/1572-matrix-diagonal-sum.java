class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0;i<r;i++)
        {

         sum+=mat[i][i];
        }
        int i = 0,j = r-1;
        int k = r-1,l=0;
        while(k>l && i<j)
        {
            sum+=mat[k][l];
            sum+=mat[i][j];
            k--;
            l++;
            i++;
            j--;
        }
        return sum;

    }
}