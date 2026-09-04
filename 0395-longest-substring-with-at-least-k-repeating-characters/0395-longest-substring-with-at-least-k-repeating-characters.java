class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k)
        {
            return 0;
        }
        int a[] = new int[26];
        for(char x : s.toCharArray())
        {
            a[x - 'a']++;
        }
        for(int i = 0;i<s.length();i++)
        {
            if(a[s.charAt(i)-'a']<k)
            {
               String l = s.substring(0,i);
               String r = s.substring(i+1);
               return Math.max(
                longestSubstring(l,k),
                longestSubstring(r,k)
               );
            }
        }
        return s.length();
    }
}