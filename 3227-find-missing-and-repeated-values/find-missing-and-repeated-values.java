class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int solution[] = new int[2];
        int n = grid.length;
        int m = grid[0].length;
        int freq[] = new int[n*n+1];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                  freq[grid[i][j]]++;
            }
        }
        for(int i =0;i<freq.length;i++){
            if(freq[i]==2){
                solution[0] = i;
            }
            if(freq[i]==0){
                solution[1] = i;
            }
        }
        return solution;
    }
}