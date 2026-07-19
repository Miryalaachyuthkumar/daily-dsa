class Solution {
    public boolean checkInclusion(String s1, String s2) {

        boolean b = false;
        if(s1.length()>s2.length())
        {
            return b;
        }
        int k = s1.length();
        int a[] = new int[26];
        for(int i = 0;i<k;i++)
        {
            a[s1.charAt(i)-'a']++;
        }
        int c[] = new int[26];
        int n = s2.length();
          
        for(int i = 0;i<k;i++)
        {
             c[s2.charAt(i)-'a']++;
             
        }
        if(Arrays.equals(a,c))
        {
            b = true;
            return b;
        }
        for(int i = k;i<n;i++)
        {
            c[s2.charAt(i-k)-'a']--;
            c[s2.charAt(i)-'a']++;
            if(Arrays.equals(a,c))
            {
                return true;
            }
        }
  return b;
    }
}