class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean b = false;
        if(n == 0)
        return true;
        int l = flowerbed.length;
        
        for(int i = 0;i<l;i++)
        {
            if(flowerbed[i] == 0)
            {
            boolean  le = (i == 0) || (flowerbed[i-1] == 0);
            boolean ri = (i == l-1 )|| (flowerbed[i+1] == 0);
            if(le && ri)
            {
                flowerbed[i] = 1;
                n--;
            }
            }
            if(n == 0)
            {
                return true;
            }
        }
        return b;
    }
}