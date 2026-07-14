class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String f = str1+str2;
        String se = str2+str1;
        String s = "";
        if(f.equals(se))
        {
            int g = Math.min(str1.length(),str2.length());
            int gm = Math.max(str1.length(),str2.length());
            int x = 0;
            for(int i =1;i<=g;i++)
            {
                if(g%i == 0 && gm%i == 0)
                {
                    x = Math.max(x,i);
                }

            }
            s = str1.substring(0,x);
        }
        else
        {
            return s;
        }
        return s;
    }
}