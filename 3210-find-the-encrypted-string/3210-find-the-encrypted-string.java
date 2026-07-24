class Solution {
    public String getEncryptedString(String s, int k) {
        String st = "";
        int n = s.length();
        for(int i = 0;i<n;i++)
        {
            int r = (i+k)%n;
            st +=s.charAt(r);
        }
        return st;
    }
}