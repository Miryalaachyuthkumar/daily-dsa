class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations)
        {
            if(s.matches("-?\\d+"))
            {
                st.push(Integer.parseInt(s));
            }
            if(s.charAt(0) == 'C')
            {
                st.pop();
            }
            if(s.charAt(0) == 'D')
            {
                int n = st.pop();
                st.push(n);
                st.push(2*n);
            }
            if(s.charAt(0) == '+')
            {
                int n = st.pop();
                int m = st.pop();
                int x = n+m;
                st.push(m);
                st.push(n);
                st.push(x);
            }
        }
        int sum = 0;
        for(int t : st)
        {
            sum+=t;
        }
   return sum;
    }
}