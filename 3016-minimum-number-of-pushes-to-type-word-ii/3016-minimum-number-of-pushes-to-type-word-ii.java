class Solution {
    public int minimumPushes(String word) {
        int sum = 0;
        int c = 1;
        int i = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : word.toCharArray())
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer> li : list)
        {
             if(8*c == i)
             {
                c++;
             }
             i++;
             sum+=c*li.getValue();
        }
        return sum;
    }
}