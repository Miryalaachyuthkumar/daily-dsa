class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int a [] = new int [n+1];
        int low  = 0;
        int high = n;
        for(int i = 0;i<n;i++)
        {
            if(s.charAt(i) == 'I')
            {
                a[i] = low;
                low++;
            }
            else
            {
                a[i] = high;
                high--;
            }


        }
        a[n] = low;
        return a;
         
    }
}