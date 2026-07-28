class Solution {
    public String makeGood(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray())
        {
            if( !st.isEmpty() && Math.abs(st.peek()-x) == 32 )
            {
                st.pop();
            }
            else
            {
                st.push(x);
            }
        }
        for(char x : st)
        {
            ans+=x;
        }
        return ans;
    }
}