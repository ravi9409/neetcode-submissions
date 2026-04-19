class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean flag = true;
        char[] c1 = s1.toCharArray();
        int start = 0;
        int end = c1.length - 1;
        for (int i = 0; i < c1.length; i++) {
            while (start < end) {
                if (c1[start] != c1[end]) {
                    flag = false;
                    start++;
                    end--;
                } else {
                    start++;
                    end--;
                }

            }
        }
        return flag;
    }
}
