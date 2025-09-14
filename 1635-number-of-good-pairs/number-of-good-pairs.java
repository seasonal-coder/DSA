import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int pairs = 0;
        for (int x : nums) {
            // if x has appeared f times before, it forms f new pairs with current x
            int f = freq.getOrDefault(x, 0);
            pairs += f;
            freq.put(x, f + 1);
        }
        return pairs;
    }
}
