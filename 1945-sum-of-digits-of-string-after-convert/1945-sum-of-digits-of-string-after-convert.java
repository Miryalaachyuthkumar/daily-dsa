class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        for(int i = 0;i<s.length();i++)
        {
            str += (s.charAt(i)-'a')+1;
        } 
        int sum = 0;
        for(int i = 0;i<str.length();i++)
        {
            sum+=str.charAt(i) - '0';
        }
        k = k -1;
        while(k-->0)
        {
            int x = sum;
            int v = 0;
            while(x!=0)
            {
                
                v+=x%10;
                x/=10;

            }
            sum = v;
        }
        return sum;
    }
}