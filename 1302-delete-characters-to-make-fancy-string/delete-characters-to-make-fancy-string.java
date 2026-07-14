class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(ans.length()>=2 && 
               ans.charAt(ans.length()-1) == s.charAt(i) && 
               ans.charAt(ans.length()-2) == s.charAt(i))
                continue;
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}