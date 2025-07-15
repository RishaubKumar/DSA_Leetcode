class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         int majEle = -1;
//         int max = nums[0];
//         int min = nums[0];
//         for(int i = 0;i<n;i++){
//             if(nums[i]>max){
//                 max = nums[i];
//             }
//             if(nums[i]<min){
//                 min = nums[i];
//             }
//         }
//         int freq[] = new int[max-min +1];
//         for(int i =0;i<n;i++){
//             freq[nums[i]-min]++;
//         }
//         for(int i =0;i<freq.length;i++){
//             if(freq[i]>(n/2)){
//                 majEle = i+min;
//             }
//         }
//         return majEle;
//     }
// }