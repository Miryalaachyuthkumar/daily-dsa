class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int tgas = 0;
        int tcost = 0;

        for (int x : gas) {
            tgas += x;
        }

        for (int x : cost) {
            tcost += x;
        }

        
        if (tgas < tcost) {
            return -1;
        }

        int n = gas.length;
       int to = 0;
       int ta = 0;
       int s = 0;
       for(int i = 0;i<n;i++)
       {
           int dif = gas[i]-cost[i];
           to+=dif;
           ta+=dif;
           if(ta<0)
           {
             s = i+1;
             ta = 0;
           }

       }
       if(to<0)
       {
        return -1;
       }
       return s;

        
       
    }
}