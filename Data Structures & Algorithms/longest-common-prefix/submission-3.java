class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

    String firstString = strs[0];
    String lastString = strs[strs.length - 1];

    int minLength = Math.min(firstString.length(), lastString.length());
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < minLength; i++) {
        if (firstString.charAt(i) == lastString.charAt(i)) {
            stringBuilder.append(firstString.charAt(i));
        } else {
            break;
        }
    }

    return stringBuilder.toString();
    }
}