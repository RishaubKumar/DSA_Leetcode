class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum =0;
//         for(int i =0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 int currSum =0;
//                 for(int k = i;k<=j;k++){
//                     currSum += nums[k];
//                 }
//                 maxSum = Math.max(currSum , maxSum);
//             }
//         }
//         return maxSum;
//     }
// }
        // int max_sum = Integer.MIN_VALUE;
        // int curr_sum = 0;
        // for(int i =0;i<nums.length;i++){
        //     curr_sum += nums[i];
        //     if(curr_sum<0){
        //         curr_sum = 0;
        //     }
        //     max_sum = Math.max(max_sum,curr_sum);
        // // }return max_sum;