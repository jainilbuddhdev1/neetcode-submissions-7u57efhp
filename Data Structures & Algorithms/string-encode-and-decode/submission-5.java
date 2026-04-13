class Solution {

    public String encode(List<String> strs) {
        if (strs.size()==0)
            return null;
        StringBuilder encoded = new StringBuilder(strs.get(0));
        for (int i = 1; i < strs.size() ; i++) {
            encoded.append("##@##").append(strs.get(i));
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        int index = 0;
        List<String> ans = new ArrayList<>();
        if (str==null)
            return ans;
        if (!str.contains("##@##"))
            return Arrays.asList(str);
        while(index != str.length()) {
            int trailingIndex = str.indexOf("##@##", index);
            if (trailingIndex==-1) {
                ans.add(str.substring(index));
                break;
            }
            ans.add(str.substring(index, trailingIndex));
            index = trailingIndex + 5;
            if (index == str.length()) {
                ans.add("");
            }
        }
        return ans;
    }
}
