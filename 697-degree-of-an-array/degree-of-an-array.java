import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            last.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        int degree = Collections.max(count.values());
        int res = nums.length;

        for (int n : count.keySet()) {
            if (count.get(n) == degree) {
                res = Math.min(res, last.get(n) - first.get(n) + 1);
            }
        }
        return res;
    }
}
