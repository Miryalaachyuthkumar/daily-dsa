class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        
        int n = columnTitle.length();
        int c = 0;
        for(int i = n-1;i>=0;i--)
        {
            int x = (int) Math.pow(26,c);
            int nu = ((columnTitle.charAt(i)-'A')+1)*x;
            sum+=nu;
            c++;
            
        }
        return sum;
    }
}