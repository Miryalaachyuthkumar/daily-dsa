class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = "";
        String b = "";
        Stack<Character> st = new Stack<>();
        for(char x : s.toCharArray())
        {
            if( x == '#' )
            {
                if(!st.isEmpty())
                {
                st.pop();
                }
            }
            else
            {
                st.push(x);
            }
        }
        Stack<Character> st1 = new Stack<>();
        for(char x : t.toCharArray())
        {
            if( x == '#')
            {
                if(!st1.isEmpty())
                {
                st1.pop();
                }
            }
            else 
            {
                st1.push(x);
            }
        }
        for(char x : st)
        {
            a+=x;
        }
        for(char x : st1)
        {
            b+=x;
        }
        if(a.equals(b))
        {
            return true;
        }
        return false;
    }
}