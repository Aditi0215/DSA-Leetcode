class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return check(s, 0, s.length() - 1);
    }

    public boolean check(String s, int left, int right) {
        if (left >= right)
            return true;

        if (s.charAt(left) != s.charAt(right))
            return false;

        return check(s, left + 1, right - 1);
    }
}