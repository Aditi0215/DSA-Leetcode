class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<=pattern.length();i++){
            st.push(i+1);

            if(i==pattern.length() || pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    ans.append(st.pop());
                }
            }
        }
        return ans.toString();
    }
}