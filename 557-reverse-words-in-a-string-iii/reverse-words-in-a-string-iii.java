class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<str.length;i++){
            StringBuilder temp = new StringBuilder(str[i]);
            ans.append(temp.reverse().append(" "));
        }
        return ans.toString().trim();
    }
}