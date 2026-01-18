class Solution {
    public boolean checkRecord(String s) {
        int absents = 0, lateStreak = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absents++;
                lateStreak = 0;
                if (absents >= 2) return false;
            } else if (c == 'L') {
                lateStreak++;
                if (lateStreak >= 3) return false;
            } else {
                lateStreak = 0;
            }
        }
        return true;
    }
}
