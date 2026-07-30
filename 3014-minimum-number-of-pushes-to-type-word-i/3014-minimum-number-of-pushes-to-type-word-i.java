class Solution {
    public int minimumPushes(String word) {
        int sum = 0;
        int c = 1;
        int i = 0;
        for(char x : word.toCharArray())
        {
            
            if(8*(c) == i)
            {
                c++;
            }
            i++;
            sum += c;
        }
        return sum;
    }
}