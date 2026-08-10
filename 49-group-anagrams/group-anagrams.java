class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // 1. Convert String → char[]
            char[] chars = str.toCharArray();

            // 2. Sort characters
            Arrays.sort(chars);

            // 3. Convert sorted char[] → String
            String key = new String(chars);

            // 4. Create a list if key doesn't exist
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // 5. Add original string to its group
            map.get(key).add(str);
        }

        // 6. Return all groups
        return new ArrayList<>(map.values());
    }
}