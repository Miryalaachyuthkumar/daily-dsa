class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int k = p.length();
        if(k>s.length())
        {
            return list;
        }
        int a[] = new int[26];

        for(int i = 0;i<k;i++)
        {
            a[p.charAt(i)-'a']++;
        }
        int b[] = new int[26];
        for(int i = 0;i<k;i++)
        {
           b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b))
        {
            list.add(0);
        }
        int n = s.length();
        for(int i = k;i<n;i++)
        {
            b[s.charAt(i-k)-'a']--;
            b[s.charAt(i)-'a']++;
            if(Arrays.equals(a,b))
            {
                list.add(i-k+1);
            }

        }
        return list;
    }
}