class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray())
        {
            if(st.isEmpty() || st.peek() != x)
            {
                st.push(x);
            }
            else
            {
                st.pop();
            }
        }
        String ans = "";
        for(char x : st)
        {
            ans+=x;
        }
        return ans;
    }
}