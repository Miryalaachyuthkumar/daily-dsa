class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int a[] = new int[n];
        int c = 0;
        
        for(int i = 0;i<n;i++)
        {
            if(seq.charAt(i) == '(')
            { 
                a[i] = c%2;
                c++;
            }
            else
            {    
                c--;
                a[i] = c%2;
                
            }
        }
        return a;
    }
}