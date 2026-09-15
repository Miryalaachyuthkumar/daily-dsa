class Solution {
    public int minPartitions(String n) {
        
        int m = 0;
        int arr [] = new int[n.length()];
        for(int i = 0;i<n.length();i++)
        {
            arr[i] = n.charAt(i)-'0';
        }
        for(int x :arr)
        {
            m = Math.max(m,x);
        }
        return m;
    }
}