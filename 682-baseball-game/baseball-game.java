import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for (String s : ops) {
            if (s.equals("+"))
                st.push(st.peek() + st.get(st.size() - 2));
            else if (s.equals("D"))
                st.push(st.peek() * 2);
            else if (s.equals("C"))
                st.pop();
            else
                st.push(Integer.parseInt(s));
        }
        int sum = 0;
        for (int x : st) sum += x;
        return sum;
    }
}
