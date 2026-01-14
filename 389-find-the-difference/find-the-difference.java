class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for (char c : (s + t).toCharArray()) res ^= c;
        return res;
    }
}
