// class Solution {
//     public long maxMatrixSum(int[][] matrix) {
//         int leftEle = Integer.MIN_VALUE;
//         long sum = 0;

//         if (!isEven(matrix)) { 
//             for (int i = 0; i < matrix.length; i++) {
//                 for (int j = 0; j < matrix[0].length; j++) {
//                     if (matrix[i][j] < 0) {
//                         if (matrix[i][j] > leftEle) {
//                             leftEle = matrix[i][j];
//                         }
//                     }
//                 }
//             }

//             for (int i = 0; i < matrix.length; i++) {
//                 for (int j = 0; j < matrix[0].length; j++) {
//                     if (matrix[i][j] < 0) {
//                         if (matrix[i][j] != leftEle) {
//                             int val = matrix[i][j] * -1;
//                             sum += val;
//                         } else {
//                             sum += matrix[i][j]; 
//                         }
//                     } else {
//                         sum += matrix[i][j];
//                     }
//                 }
//             }
//         } else {
//             for (int i = 0; i < matrix.length; i++) {
//                 for (int j = 0; j < matrix[0].length; j++) {
//                     if (matrix[i][j] < 0) {
//                         int val = matrix[i][j] * -1;
//                         sum += val;
//                     } else {
//                         sum += matrix[i][j];
//                     }
//                 }
//             }
//         }

//         return sum;
//     }

//     public boolean isEven(int[][] matrix) {
//         int count = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] < 0) {
//                     count++;
//                 }
//             }
//         }
//         return count % 2 == 0;
//     }
// }

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sumAbs = 0;
        int minAbs = Integer.MAX_VALUE;
        int negCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int v = matrix[i][j];
                sumAbs += Math.abs((long) v);
                minAbs = Math.min(minAbs, Math.abs(v));
                if (v < 0) negCount++;
            }
        }

        if (negCount % 2 == 0) return sumAbs;
        return sumAbs - 2L * minAbs;
    }

    public boolean isEven(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }
        return count % 2 == 0;
    }
}

