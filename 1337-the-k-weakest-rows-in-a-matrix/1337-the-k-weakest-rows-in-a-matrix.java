class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length;
        int c = mat[0].length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<r;i++)
        {    int sum = 0;
            for(int j = 0;j<c;j++)
            {
                 if(mat[i][j] == 1)
                 {
                    sum++;
                 }
            }
            map.put(i,sum);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue();
            }
            return a.getKey() - b.getKey();
        });
        int a[] = new int[r];
        for(int i = 0;i<r;i++)
        {
            a[i] = list.get(i).getKey();
        }
        int b[] = new int[k];
        for(int i = 0;i<k;i++)
        {
           b[i] = a[i];
        }
        return b;
    }
}