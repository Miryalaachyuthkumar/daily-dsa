class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for(String x : words)
        {
            list.add(x);
        }
        int n = words.length;
        for(int i = 0;i<n-1;i++)
        {
            int j = i+1;
            HashMap<Character,Integer> map1 = new HashMap<>();
            for(char x : words[i].toCharArray())
            {
                map1.put(x,map1.getOrDefault(x,0)+1);
            }
            HashMap<Character,Integer> map2 = new HashMap<>();
             for(char x : words[j].toCharArray())
            {
                map2.put(x,map2.getOrDefault(x,0)+1);
            }
            if(map1.equals(map2))
            {
                list.remove(words[j]);
            }
            map1.clear();
            map2.clear();

        }
        return list;

    }
}