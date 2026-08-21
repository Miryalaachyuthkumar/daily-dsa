class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int a[][] = new int[r][r];
        for(int i =0 ;i<r;i++)
        {
            for(int j = 0;j<r;j++)
            {
                 if(image[i][j] == 1)
                 {
                    image[i][j] = 0;
                 }
                 else
                 {
                    image[i][j] = 1; 
                 }
            }
        }
        for(int i = 0;i<r;i++)
        {   int k = 0;
            for(int j = r-1;j>=0;j--)
            {
                a[i][k] = image[i][j];
                k++;
                }
        }
        return a;
    }
}