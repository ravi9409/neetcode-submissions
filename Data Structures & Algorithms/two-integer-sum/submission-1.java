class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] a1 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                a1[0] = hashMap.get(target - nums[i]);
                a1[1] = i;
                return a1;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return a1;
    }
}
