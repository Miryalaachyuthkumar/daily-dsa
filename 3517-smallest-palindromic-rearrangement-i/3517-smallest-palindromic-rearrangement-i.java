class Solution {
    public String smallestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        String sb = s.substring(0,n/2);
         char arr [] = sb.toCharArray();
         Arrays.sort(arr);
        String sb1 = new String(arr);
        if(n % 2 == 0)
        {
            ans+=sb1;
            String rev = new StringBuilder(sb1).reverse().toString();
            ans+=rev;
        }
        else
        {    
            
            
            ans+=sb1;
            ans+=s.charAt((n/2));
            String rev = new StringBuilder(sb1).reverse().toString();
            ans+=rev;
            

        }
        return ans;
    }
}