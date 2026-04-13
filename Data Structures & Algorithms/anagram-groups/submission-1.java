class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> anagramMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            Map<Character, Integer> characterFrequency = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                Character charJ = str.charAt(j);
                characterFrequency.put(charJ, characterFrequency.getOrDefault(charJ, 0) + 1);
            }
            System.out.println("Frequency Map for str - " + str + " is  -- " + characterFrequency);

            List<String> currentList = anagramMap.getOrDefault(characterFrequency, new ArrayList<>());
            currentList.add(str);

            anagramMap.put(characterFrequency, currentList);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
