class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        ArrayList<Pairs> list = new ArrayList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    list.add(new Pairs(i, j));
                }
            }
        }

        for(Pairs p : list){
            int i = p.i;
            int j = p.j;

            for(int k=0; k<m; k++){
                matrix[k][j] = 0;
            }

            for(int k=0; k<n; k++){
                matrix[i][k] = 0;
            }
        }
    }
}
class Pairs{
    int i, j;

    public Pairs(int i, int j){
        this.i = i;
        this.j = j;
    }
}