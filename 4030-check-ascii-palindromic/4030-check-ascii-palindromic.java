class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for( char c : s.toCharArray())
            {
                String re = Integer.toBinaryString(c);
                while(re.length()<8)
                    {
                        re = "0"+re;
                        
                    }
                sb.append(re);
            }
        String sa = sb.toString();
        for(int i = 0 ,j =sa.length()-1;i<j;i++,j--)
            {
            if(sa.charAt(i)!=sa.charAt(j))
            {
                return false;
            }
            }
        return true;
    }
}