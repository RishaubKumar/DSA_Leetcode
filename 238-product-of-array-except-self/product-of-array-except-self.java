class Solution{
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int prefix[] = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        int suffix[] = new int[nums.length];
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        int result[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            result[i] = prefix[i]*suffix[i];
        }
        return result;
    }
}
// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int result[] = new int[nums.length];
//         for(int i =0;i<nums.length;i++){
//             int mul =1;
//             for(int j = 0;j<nums.length;j++){
//                 if(i != j){
//                     mul *= nums[j];
//                 }else{
//                     mul *= 1;
//                 }
//             }
//             result[i]= mul;
//         }
//         return result;
//     }
// }