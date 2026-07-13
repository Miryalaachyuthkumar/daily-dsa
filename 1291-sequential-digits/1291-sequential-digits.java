class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> li = new ArrayList<>();
        String s = "123456789";
        int dil = (int)Math.log10(low)+1;
        int digu = (int)Math.log10(high)+1;
        int i = 0;
        
        while( dil<=digu)
        {
            int  j = i+dil-1;
            if(j>=s.length())
            {
                dil++;
                i = 0;
                continue;
            }
            int num  = Integer.parseInt(s.substring(i,j+1));
            
            if(num>=low && num<=high)
            {
                li.add(num);
            }
            i++;
        }
        return li;
    }
}