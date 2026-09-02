class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : bills)
        {
            if(x == 5)
            {
               map.put(5,map.getOrDefault(5,0)+1);
            }
            if(x == 10)
            {
                if(map.getOrDefault(5,0)>=1)
                {
                map.put(10,map.getOrDefault(10,0)+1);
                map.put(5,map.get(5) - 1);
                }else
                {
                    return false;
                }
            }
            if(x == 20)
            {
                if(map.getOrDefault(5,0)>=1 && map.getOrDefault(10,0)>=1)
                {
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)-1);
                    map.put(20,map.getOrDefault(20,0)+1);
                }else if(map.getOrDefault(5,0)>= 3)
                {
                    map.put(5,map.get(5)-3);
                    map.put(20,map.getOrDefault(20,0)+1);
                }else
                {
                    return false;
                }
            }
        }
        return true;
    }
}