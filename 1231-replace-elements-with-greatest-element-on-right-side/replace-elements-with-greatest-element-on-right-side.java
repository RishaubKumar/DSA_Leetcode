class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxVal = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxVal) {
                    maxVal = arr[j];
                }
            }
            arr[i] = maxVal;
        }
        return arr;
    }
}