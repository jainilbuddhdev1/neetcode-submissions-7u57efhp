class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphaNumeric = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                alphaNumeric.append(s.charAt(i));
        }

        if (alphaNumeric.length() == 0 || alphaNumeric.length() == 1)
            return true;

        int halfLength = alphaNumeric.length() / 2;
        int n = alphaNumeric.length() - 1;
        for (int i = 0; i < halfLength; i++) {
            char c1 = alphaNumeric.charAt(i);
            c1 = Character.isUpperCase(c1) ? Character.toLowerCase(c1) : c1;

            char c2 = alphaNumeric.charAt(n-i);
            c2 = Character.isUpperCase(c2) ? Character.toLowerCase(c2) : c2;

            if (c1 != c2)
                return false;
        }

        return true;
    }
}
