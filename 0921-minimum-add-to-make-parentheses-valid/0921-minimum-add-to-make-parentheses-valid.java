class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0;
        int c = 0;
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray())
        {
             if(x == '(')
             {
                st.push(x);
             }
             else
             {
                if(!st.isEmpty() && st.peek() == '(')
                {
                    st.pop();
                }
                else
                {
                    st.push(x);
                }
             }
        }
        return st.size();
    }
}