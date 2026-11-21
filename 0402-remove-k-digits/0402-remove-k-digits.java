
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < num.length(); i++)
        {
            int current = num.charAt(i) - '0';

            while(!st.isEmpty() && k > 0 && st.peek() > current)
            {
                st.pop();
                k--;
            }

            st.push(current);
        }

        while(k > 0)
        {
            st.pop();
            k--;
        }

        StringBuilder s = new StringBuilder();

        while(!st.isEmpty())
        {
            s.append(st.pop());
        }

        s.reverse();

        while(s.length() > 0 && s.charAt(0) == '0')
        {
            s.deleteCharAt(0);
        }

        return s.length() == 0 ? "0" : s.toString();
    }
}
