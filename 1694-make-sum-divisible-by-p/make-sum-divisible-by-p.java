// class Solution {
//     public int minSubarray(int[] nums, int p) {
//         int sum =0;
//         for(int i =0;i<nums.length;i++){
//             sum += nums[i];
//         }
//         if(sum > p){
//                     int rem = sum % p;
//         if(rem ==0){
//             return 0;
//         }else{
//             return SmallSubarraySize(nums, rem);
//         }
//         }else{
//             return -1;
//         }

//     }
//     static int SmallSubarraySize(int[] nums, int rem){
//         int SmallestSize = Integer.MAX_VALUE;

//         for(int i =0;i<nums.length;i++){
//         for(int j =i;j<nums.length;j++){
//             int size =0;
//             int currSum = 0;
//         for(int k =i;k<=j;k++){
//             currSum += nums[k];
//             size++;
//         }
//         if(currSum == rem){
//             SmallestSize = Math.min(size, SmallestSize);
//         }
//             }
//                 }
//         return SmallestSize;    }
//     }
// class Solution {
//     public int minSubarray(int[] nums, int p) {
//         long sum = 0;
//         for (int num : nums) {
//             sum += num;
//         }
//         int rem = (int)(sum % p);
//         if (rem == 0) {
//             return 0;
//         } else {
//             return SmallSubarraySize(nums, rem, p);
//         }
//     }

//     static int SmallSubarraySize(int[] nums, int rem, int p) {
//         int n = nums.length;
//         int minLen = n; 

//         for (int i = 0; i < n; i++) {
//             long currSum = 0;
//             for (int j = i; j < n; j++) {
//                 currSum += nums[j];
//                 if (currSum % p == rem) {
//                     int len = j - i + 1;
//                     if (len < minLen) {
//                         minLen = len;
//                     }
//                 }
//             }
//         }

//         if (minLen == n) {
//             return -1;
//         }
//         return minLen;
//     }
// }
class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) {
            total = (total + num) % p;
        }
        if (total == 0) return 0;  // Already divisible

        Map<Long, Integer> idxMap = new HashMap<>();
        idxMap.put(0L, -1);

        long prefix = 0;
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;
            // (prefix - rem) % p == mod value to remove
            long need = (prefix - total + p) % p;
            if (idxMap.containsKey(need)) {
                res = Math.min(res, i - idxMap.get(need));
            }
            idxMap.put(prefix, i);
        }
        return res == nums.length ? -1 : res;
    }
}

