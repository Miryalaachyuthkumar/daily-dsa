class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        //HashMap<Integer,Integer> map2 = new HashMap<>();
    
        int n = A.length;
        int z [] = new int[n];
        for(int i = 0;i<n;i++)
        {    int c = 0;
            map1.put(A[i],map1.getOrDefault(0,A[i])+1);
            for(int j = 0;j<=i;j++)
            {
                 if(map1.containsKey(B[j]))
                 {
                    c++;
                 }
            }
            z[i] = c;

        }
        return z; 
    }
}