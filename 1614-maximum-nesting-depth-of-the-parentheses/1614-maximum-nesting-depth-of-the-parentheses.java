class Solution {
    public int maxDepth(String s) {
    Stack<Character> st = new Stack<>();
    int c = 0;
    int max = Integer.MIN_VALUE;
    for(char x : s.toCharArray())
    {
        if(x == '(')
        {
            st.push(x);
            c++;
            max = Math.max(c,max);
        }
        if(x == ')')
        {
            st.pop();
            c--;
        }
    }
    if(max == Integer.MIN_VALUE)
    {
        return 0;
    }
    return max;
    }
}