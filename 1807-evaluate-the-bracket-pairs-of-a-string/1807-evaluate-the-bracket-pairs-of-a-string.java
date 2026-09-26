class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> x : knowledge)
        {
            map.put(x.get(0),x.get(1));
        }
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i = 0;i<n;i++)
        {    
            if(s.charAt(i) == '(')
            {  int j = i+1;
               String x = "";
               while(s.charAt(j) != ')')
               {
                 x+=s.charAt(j);
                 j++;
               }
               if(map.containsKey(x))
               {
                ans.append(map.get(x));
               }
               else
               {
                ans.append("?");
               }
               i = j;
            }else
            {
            
            ans.append(s.charAt(i));
            }
        }
        return ans.toString();        
    }
}