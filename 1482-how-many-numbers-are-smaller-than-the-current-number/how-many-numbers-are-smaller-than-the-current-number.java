
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] copy = nums.clone();      // clone original
        Arrays.sort(copy);             // sort the clone

        Map<Integer, Integer> firstIndex = new HashMap<>();
        // store first occurrence index of each value in sorted array
        for (int i = 0; i < n; i++) {
            firstIndex.putIfAbsent(copy[i], i);
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = firstIndex.get(nums[i]);
        }
        return res;
    }
}
