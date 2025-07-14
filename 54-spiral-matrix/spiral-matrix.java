import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;
        
        while (startRow <= endRow && startCol <= endCol) {
            // Traverse from left to right on top row
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
            startRow++;
            
            // Traverse from top to bottom on right column
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;
            
            if (startRow <= endRow) {
                // Traverse from right to left on bottom row
                for (int j = endCol; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
                endRow--;
            }
            
            if (startCol <= endCol) {
                // Traverse from bottom to top on left column
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        
        return result;
    }
}