class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0)
        {
            return new int[0];
        }
        int a [] = new int [arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            a[i] = arr[i];
        }
        Arrays.sort(a);
        int res[] = new int [arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        int r = 1;
        map.put(a[0],1);
        for(int i = 1;i<arr.length;i++)
        {
            if(a[i]!=a[i-1])
            {
               r++;
            }
            map.put(a[i],r);
        } 
        for(int i = 0;i<arr.length;i++)
        {
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}