class Solution {
    public String reversePrefix(String s, int k) {
        String prefix = new StringBuilder(s.substring(0,k)).reverse().toString();
        return prefix+s.substring(k);
    }
}