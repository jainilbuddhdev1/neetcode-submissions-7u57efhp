class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> characterCountS = new HashMap<>();
        Map<Character, Integer> characterCountT = new HashMap<>();
        
        if (s.length()!=t.length())
            return false;
        
        for (int i = 0; i < s.length(); i++) {
            char characterS = s.charAt(i);
            char characterT = t.charAt(i);
            characterCountS.put(characterS, characterCountS.getOrDefault(characterS, 0) + 1);
            characterCountT.put(characterT, characterCountT.getOrDefault(characterT, 0) + 1);
        }
        
        if (characterCountS.size()!=characterCountT.size())
            return false;

        Iterator<Map.Entry<Character, Integer>> mapIterator = characterCountS.entrySet().iterator();

        while (mapIterator.hasNext()) {
            Map.Entry entry = mapIterator.next();
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("Value = " + entry.getValue());
            System.out.println("Value T = " + characterCountT.getOrDefault(entry.getKey(), 0));
            if (!entry.getValue().equals(characterCountT.getOrDefault(entry.getKey(), 0))) {
                System.out.println("Value = " + entry.getValue() + " != Value T = " + characterCountT.getOrDefault(entry.getKey(), 0));
                return false;
            }
        }
        return true;

    }
}
