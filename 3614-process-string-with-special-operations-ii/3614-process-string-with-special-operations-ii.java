class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n];

        long l = 0;

        
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);

            if (x >= 'a' && x <= 'z') {
                l++;
            } else if (x == '*') {
                if (l > 0) l--;
            } else if (x == '#') {
                l *= 2;
            }
            

            len[i] = l;
        }

        if (k >= l) return '.';

      
        for (int i = n - 1; i >= 0; i--) {
            char x = s.charAt(i);
            long curLen = len[i];

            if (x >= 'a' && x <= 'z') {
                if (k == curLen - 1) {
                    return x;
                }
            } 
            else if (x == '#') {
                long oldLen = curLen / 2;
                k %= oldLen;
            } 
            else if (x == '%') {
                k = curLen - 1 - k;
            }
            
        }

        return '.';
    }
}