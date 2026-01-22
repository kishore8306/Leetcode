class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int sum = 0;
        for (int i = 0; i < t.length; i++)
            sum += (i + 1 < t.length && t[i] + d > t[i + 1]) ? t[i + 1] - t[i] : d;
        return sum;
    }
}
