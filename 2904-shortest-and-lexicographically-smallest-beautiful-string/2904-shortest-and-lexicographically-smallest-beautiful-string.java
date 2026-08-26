class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int min = Integer.MAX_VALUE;
        int n = s.length();
        int c = 0;
        String ans = "";
        for(int j = 0;j<n;j++)
        {
            if(s.charAt(j) == '1')
            {
                c++;
            }
            while(c == k)
            {
                int le = j-i+1;
                if(le<min || (le == min && s.substring(i,j+1).compareTo(ans)<0))
                {
                    min = le;
                    ans = s.substring(i,j+1);
                }
            
            if(s.charAt(i) == '1')
            {
                c--;
            }
            i++;
            }
        }
        return ans;
    }
}