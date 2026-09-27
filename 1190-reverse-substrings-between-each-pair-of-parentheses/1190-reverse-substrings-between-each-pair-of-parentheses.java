class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ')') {

                StringBuilder temp = new StringBuilder();

                while (st.peek() != '(') {
                    temp.append(st.pop());
                }

                st.pop(); 

                for (int j = 0; j < temp.length(); j++) {
                    st.push(temp.charAt(j));
                }

            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}