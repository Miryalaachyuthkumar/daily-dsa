class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int n = numRows;
        for(int i = 1;i<=n;i++)
        {  List<Integer> row = new ArrayList<>();
           
            for(int j = 1 ;j<=i;j++)
            {
            if( j == 1 || j == i)
            {
                row.add(1);
            }
            else
            {
                 List<Integer> pre = list.get(i-2);
            row.add(pre.get(j-2) + pre.get(j-1));
            }
            }
            list.add(row);

        }
        return list;
    }
}