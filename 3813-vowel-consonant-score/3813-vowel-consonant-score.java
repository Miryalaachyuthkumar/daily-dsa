class Solution {
    public int vowelConsonantScore(String s) {
        int c = 0;
        int v = 0;
        for(char x : s.toCharArray())
        {   
            if (!String.valueOf(x).matches("[a-z]")) {
                  continue;
            }
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        if(c>0)
        {
            int ans = v/c;
            return ans;
        }
        return 0;
    }
}