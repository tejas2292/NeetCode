class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Edge case
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // HashMap to store sorted strings as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each string in strs
        for (String str : strs) {
            // Convert string to char array, sort it, and convert back to string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // Check if sortedStr is already a key in map
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the corresponding list
            map.get(sortedStr).add(str);
        }
        
        // Convert values of map to list of lists
        List<List<String>> result = new ArrayList<>(map.values());
        
        return result;
    }
}
