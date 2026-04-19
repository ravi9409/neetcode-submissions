class Solution {
    public boolean isAnagram(String s, String t) {
         char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return String.valueOf(a1).equals(String.valueOf(a2));
    }
}
