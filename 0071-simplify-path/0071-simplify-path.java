class Solution {
    public String simplifyPath(String path) {
        String s = "";
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");
        for(String x : parts)
        {
            if(x.equals("") || x.equals("."))
            {
                continue;
            }
            if(x.equals("..")  )
            {      if(!st.isEmpty())
                    st.pop();
            }
            else
            {
                st.push(x);
            }
        }
        for(String x : st)
        {
            s+= "/"+x;
        }
        if (s.equals("")) {
            return "/";
        }
        return s;
    }
}