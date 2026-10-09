class Solution {
    public int minInsertions(String s) {
        int o = 0;
        int in = 0;
        int i = 0;
        int n = s.length();
        while(i<s.length())
        {
            if(s.charAt(i) == '(')
            {
                o++;
                i++;
            }
            else
            {
                if(i+1<s.length() && s.charAt(i+1) == ')')
                {
                    i+=2;
                }
                else
                {
                    in++;
                    i++;
                }
            
            if(o>0)
            {
                o--;
            }
            else
            {
                in++;
            }
            }
        }
        return in+o*2;
        
    }
}