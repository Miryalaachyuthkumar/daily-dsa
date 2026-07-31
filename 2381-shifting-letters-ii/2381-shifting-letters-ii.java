class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int a[] = new int[n+1];
        
        int c = shifts.length;
        for(int i = 0;i<c;i++)
        {
            int l = shifts[i][0];
            int r = shifts[i][1];
            if(shifts[i][2] == 0)
            {
                a[l]--;
                a[r+1]++;
            }
            else
            {
                a[l]++;
                a[r+1]--;
            }
        }
        for(int i = 1;i<s.length();i++)
        {
            a[i]+=a[i-1];
        }
        StringBuilder st = new StringBuilder();
        for(int i = 0;i<n;i++)
        {
            int sh = ((a[i]%26)+26)%26;
            char x = (char) ('a'+(s.charAt(i)-'a'+sh)%26);
            st.append(x);
        }
        return st.toString();
    }
}