class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length, i = 0, j = 0;
        int[] merged = new int[m + n];
        for (int k = 0; k < m + n; k++) {
            if (i < m && (j >= n || A[i] <= B[j])) merged[k] = A[i++];
            else merged[k] = B[j++];
        }
        int mid = (m + n) / 2;
        return (m + n) % 2 == 0 ? (merged[mid - 1] + merged[mid]) / 2.0 : merged[mid];
    }
}
