class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a [] = s.split(" ");
        if(a.length != pattern.length())
        {
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        int n = pattern.length();
        for(int i = 0;i<n;i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!a[i].equals(map.get(pattern.charAt(i))))
                {
                    return false;
                }
            }else
            {
                map.put(pattern.charAt(i),a[i]);
            }

        }
         HashMap<String,Character> map1 = new HashMap<>();
          for(int i = 0;i<n;i++)
        {
            if(map1.containsKey(a[i]))
            {
                if(map1.get(a[i]) != pattern.charAt(i))
                {
                    return false;
                }
            }else
            {
                map1.put(a[i],pattern.charAt(i));
            }

        }
        return true;

    }
}