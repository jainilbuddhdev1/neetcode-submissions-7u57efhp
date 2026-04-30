class Solution {
    public boolean isValid(String s) {
                int n = s.length();

        List<Character> list = new LinkedList<>();
        int i = 0;
        while (i < n) {
            char character = s.charAt(i);
            char openingCharacter = 0;
            if (list.size()>0)
                openingCharacter = list.get(list.size() - 1);
            if (character == '(' || character == '{' || character == '[') {
                list.add(character);
                i++;
            } else if (list.size()>0 && ( (character == '}' && openingCharacter == '{') ||
                    (character == ')' && openingCharacter == '(') ||
                    (character == ']' && openingCharacter == '[') ) ) {
                list.remove(list.size()-1);
                i++;
            } else
                return false;
        }
        if (list.size()!=0)
            return false;

        return true;
    }
}
