class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder st = new StringBuilder();
        long t = 0;
    
        for(int i = s.length()-1;i>=0;i--)
        {     t += shifts[i];
            char x = (char)((s.charAt(i) - 'a'+t)%26+'a');
            st.append(x); 
        }
        return st.reverse().toString();
    }
}