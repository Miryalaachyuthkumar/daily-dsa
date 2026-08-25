class Solution {
    public int lengthOfLastWord(String s) {
        String a[] = s.split(" ");
        int n = a.length;
        String sa = a[n-1];
        return sa.length();
    }
}