class Solution {
    public void reverseString(char[] s) {
        char ch[] = new char[s.length];
        int left = 0;
        int right = s.length-1;

        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}