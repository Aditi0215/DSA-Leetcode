class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }
     public void generate(String s, int n, List<String> result) {

        if (s.length() == n) {
            result.add(s);
            return;
        }

        // Add 1
        generate(s + "1", n, result);

        // Add 0 only if previous character is not 0
        if (s.length() == 0 || s.charAt(s.length() - 1) != '0') {
            generate(s + "0", n, result);
        }
    }
}