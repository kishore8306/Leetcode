class Solution {
    public boolean isThree(int n) {
        int r = (int) Math.sqrt(n);
        if(r*r != n || r < 2) return false;

        for(int i = 2; i*i<= r; i++)
            if(r%i==0)return false;

            return true;
    }
}