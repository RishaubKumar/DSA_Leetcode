class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the initial sum of the first 'k' elements
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        double maxSum = windowSum;
        
        // Slide the window through the array
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; // Add new element and remove the oldest
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum / k;
    }
}
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i <= nums.length - k; i++) {  
//             double currSum = 0;
//             for (int j = i; j < i + k; j++) {  
//                 currSum += nums[j];
//             }
//             maxSum = Math.max(maxSum, currSum);
//         }
//         return maxSum / k;  
//     }
// }