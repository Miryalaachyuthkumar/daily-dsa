class Solution {
    public int leastInterval(char[] tasks, int n) {
        int nl = tasks.length;
        HashMap<Character,Integer>map = new HashMap<>();
        for(char x : tasks)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int x : map.values())
        {
            max = Math.max(max,x);
        }
        int c = 0;
        for(int x : map.values())
        {
            if(max == x)
            {
                c++;
            }
        }
        int ans = Math.max(nl,((max-1 )*(n+1)+c));
        return ans;
    }
}