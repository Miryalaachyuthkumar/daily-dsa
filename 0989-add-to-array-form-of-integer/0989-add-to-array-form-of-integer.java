class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length-1;
        int c = 0;
        int sum = 0;
        while(i>=0 || k>0 || c>0)
        {
             sum = c;
            if(i>=0)
            {
                sum+=num[i];
            }
            sum+= k%10;
            list.add(sum%10);
            c = sum/10;
            i--;
            k/=10;
        }
        
    Collections.reverse(list);
    return list;
    }
}