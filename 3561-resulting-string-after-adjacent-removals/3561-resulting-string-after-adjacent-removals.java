class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray())
        {
            if(!st.isEmpty())
            {
            if(Math.abs(st.peek()-x) == 1 || Math.abs(st.peek()-x) == 25)
            {
                st.pop();
                continue;
            }
            }
            st.push(x);

        }
        StringBuilder sa = new StringBuilder();
        while(!st.isEmpty())
        {
            sa.append(st.pop());
        }
       
        return sa.reverse().toString();
    }
}