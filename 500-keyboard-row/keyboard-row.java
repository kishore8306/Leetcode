import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop", r2 = "asdfghjkl", r3 = "zxcvbnm";
        List<String> res = new ArrayList<>();

        for (String w : words) {
            String s = w.toLowerCase();
            if (s.chars().allMatch(c -> r1.indexOf(c) >= 0) ||
                s.chars().allMatch(c -> r2.indexOf(c) >= 0) ||
                s.chars().allMatch(c -> r3.indexOf(c) >= 0))
                res.add(w);
        }
        return res.toArray(new String[0]);
    }
}
