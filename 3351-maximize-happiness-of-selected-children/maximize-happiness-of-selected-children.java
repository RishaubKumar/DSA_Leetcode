import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness); // sort once

        long sum = 0; // must be long (answer can be large)
        int dec = 0;

        for (int i = happiness.length - 1; i >= 0 && dec < k; i--) {
            int val = happiness[i] - dec;          // after dec selections, remaining values decreased by dec
            if (val <= 0) break;                   // values are clamped at 0, so no need to continue
            sum += val;
            dec++;
        }

        return sum;
    }

    // kept only to preserve your structure; not used in the corrected solution
    public static int[] counter(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) arr[i]--;
        }
        return arr;
    }
}
