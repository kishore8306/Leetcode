class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, max = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (!set.add(s.charAt(r)))
                set.remove(s.charAt(l++));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
