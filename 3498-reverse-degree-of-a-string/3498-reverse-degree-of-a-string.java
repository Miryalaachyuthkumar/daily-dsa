class Solution {
    public int reverseDegree(String s) {
        char arr [] = s.toCharArray();
        int sum = 0; 
        for(int i = 0;i<arr.length;i++)
        {
            int val = 26 - (arr[i] - 'a');
            int x = val * (i+1);
            sum+=x;
        }
        return sum;
    }
}