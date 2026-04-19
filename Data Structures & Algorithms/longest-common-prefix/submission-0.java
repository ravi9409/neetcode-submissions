class Solution {
    public String longestCommonPrefix(String[] strs) {
         Arrays.sort(strs);
        StringBuffer stringBuffer = new StringBuffer();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            else
                stringBuffer.append(first[i]);
        }
        return new String(stringBuffer);
    }
}