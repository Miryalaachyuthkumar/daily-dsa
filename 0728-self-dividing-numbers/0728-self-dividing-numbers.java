class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> l = new ArrayList<>();
        boolean b = true;
         for(int i = left ;i<=right;i++)
         {   b = true;
              int r = i;
              int k = i;
              while(r>0)
              {
                int d = r%10;
                if( d == 0 || k%d != 0)
                {
                      b = false;
                      break;
                }
                r/=10;
              }
              if(b)
              {
                l.add(i);
              }
         }
         return l;
    }
}