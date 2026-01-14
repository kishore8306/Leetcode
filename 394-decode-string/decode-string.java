class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> num = new Stack<>();
        String cur = "";
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) k = k * 10 + c - '0';
            else if (c == '[') {
                num.push(k);
                st.push(cur);
                cur = "";
                k = 0;
            } else if (c == ']') {
                StringBuilder sb = new StringBuilder(st.pop());
                int t = num.pop();
                while (t-- > 0) sb.append(cur);
                cur = sb.toString();
            } else cur += c;
        }
        return cur;
    }
}
