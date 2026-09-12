class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> se = new HashSet<>();
        for(char c : s.toCharArray())
        {
            se.add(c);
        }
        return se.size();
    }
}