class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int fn = firstList.length;
        int sn = secondList.length;
        
          for(int i = 0;i<fn;i++)
          { int cs = firstList[i][0];
            int ce = firstList[i][1];
            int s = Integer.MIN_VALUE;
            int e = Integer.MAX_VALUE;
             for(int j = 0;j<sn;j++)
             {
                int ns = secondList[j][0];
                int ne = secondList[j][1];
                s = Math.max(cs,ns);
                e = Math.min(ce,ne);
                if(s<=e)
                {
                    list.add(new int[]{s,e});
                }
             }
          }
          int [][] res = list.toArray(new int[list.size()][]);
          return res;
    }
}