class Solution {
    public int maxProduct(int n) {
        int l = 0;
        int c = n;
        while(c>0)
        {
            l++;
            c/=10;
        }
        int a[] = new int[l];
        c = n;
        int i = 0;
        while(c>0)
        {
            a[i++] = c %10;
            c/=10;
        }
        Arrays.sort(a);
        return a[a.length-1]*a[a.length-2];
    }

}