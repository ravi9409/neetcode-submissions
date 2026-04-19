class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                count++;
                hashMap.put(nums[i], hashMap.get(nums[i] + 1));
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }
}