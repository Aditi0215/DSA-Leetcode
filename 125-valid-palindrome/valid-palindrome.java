class Solution {
    public boolean isPalindrome(String s) {
       char[] arr = new char[s.length()];
        int c = 0;
        for(char ch : s.toCharArray()){
            if(ch>='A' && ch<='Z'){
                arr[c++] = (char)(ch + 32);
            }
            else if(ch>='a' && ch<='z'){
                arr[c++] = ch;
            }
            else if(ch>='0' && ch<='9'){
                arr[c++] = ch;
            }
        }
        int i = 0;
        int j = c - 1;
        while(i < j){
            if(arr[i] != arr[j]){
                return false;
            } 
            i++;
            j--;
        }
        return true;
    }
}