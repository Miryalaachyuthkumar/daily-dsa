class Solution {
    public int minChanges(String s) {
        int c = 0;
        for(int i = 0;i<s.length();i+=2)
        {
            int j = i+2;
            String sa =s.substring(i,j);
            if(sa.equals("10") || sa.equals("01"))
            {
                c++;
            }  
        }
        return c;
    }
}