import java.util.*;

class Solution {
    public int maxDistinct(String s) {
        Set<Character> usedStart = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!usedStart.contains(ch)) {
                count++;              // start new substring
                usedStart.add(ch);
            }
        }

        return count;
    }
}