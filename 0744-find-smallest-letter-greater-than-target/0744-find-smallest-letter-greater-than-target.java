class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int n = letters.length;
        int r = n-1;
        int x = -1;
        while(l<=r)
        {
            int mid = l + (r-l)/2;
             if((letters[mid]-'0')>(target-'0'))
             {
                x = mid;
                r = mid-1;
             }
             else
             {
                l = mid+1;
             }
        }
        if(x != -1)
        {
            return letters[x];
        }
        return letters[0];
    }
}