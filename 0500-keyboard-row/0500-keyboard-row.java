class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 =  "asdfghjkl";
        String r3 =  "zxcvbnm";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        HashMap<Character,Integer> map3 = new HashMap<>();
        boolean a = true,b = true, c = true;
        for(char x : r1.toCharArray())
        {
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        for(char x : r2.toCharArray())
        {
            map2.put(x,map2.getOrDefault(x,0)+1);
        }
        for(char x : r3.toCharArray())
        {
            map3.put(x,map3.getOrDefault(x,0)+1);
        }
        int ans[] = new int [words.length];
        for(int i = 0;i<words.length;i++)
        {            a = true;
                 int n = words[i].length();
            for(int j = 0;j<n;j++)
            {    char x =  Character.toLowerCase(words[i].charAt(j));
                if(!map1.containsKey(x))
                {
                   a = false;
                   break;
                }
            }
           if(a)
           {
            ans[i] = 1; 
           }

        }
        for(int i = 0;i<words.length;i++)
        {       b = true;
                int n = words[i].length();
            for(int j = 0;j<n;j++)
            {    char x =  Character.toLowerCase(words[i].charAt(j));
                if(!map2.containsKey(x))
                {
                   b = false;
                   break;
                }
            }
           if(b)
           {
            ans[i] = 1; 
           }
        }
        for(int i = 0;i<words.length;i++)
        {    c = true; 
             int n = words[i].length();
            for(int j = 0;j<n;j++)
            {    char x =  Character.toLowerCase(words[i].charAt(j));
                if(!map3.containsKey(x))
                {
                   c = false;
                   break;
                }
            }
           if(c)
           {
            ans[i] = 1; 
           }
        }
        int le = 0;
        for(int i = 0;i<ans.length;i++)
        {
            if(ans[i] == 1)
            {
                le++;
            }
        }
        String fina [] = new String[le];
        int j = 0;
        for(int i = 0;i<ans.length;i++)
        {
            if(ans[i] == 1)
            {
                 fina[j++] = words[i];
            }
        }
        return fina;
    }
}