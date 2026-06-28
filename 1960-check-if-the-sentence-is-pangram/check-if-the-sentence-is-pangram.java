class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean isFound[] = new boolean[26];
        boolean isPanagram = true;
        String s = sentence.toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            isFound[ch-'a'] = true;
        }
        for(int i=0;i<26;i++){
            if(isFound[i]==false){
                isPanagram = false;
                break;
            }
        }
        return isPanagram;
    }
}