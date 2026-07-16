class Solution {
    public int maxVowels(String s, int k) {

        int c = 0;
        for(int i = 0;i<k;i++)
        {
            if(isvo(s.charAt(i)))
            {
                c++;
            }
        }
        int max = c;
        for(int i = k;i<s.length();i++)
        {
            if(isvo(s.charAt(i-k)))
            {
                c--;
            }
            if(isvo(s.charAt(i)))
            {
                c++;
            }
            max = Math.max(c,max);
        }
        
        return max;
    }
    private boolean isvo(char x)
        {
             return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';   
        }
}