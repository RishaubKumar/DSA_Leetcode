class Solution{
    public int majorityElement(int[] nums){
        int freq = 0, ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(nums[i] == ans){
                freq++;
            }else{
                freq--;
            }
        }
    return ans;
    }
}
// This implementation is done using boyes moore algo , I have simply considered the element at ith index to be the majority, and if it is majority than it should be there more than n/2 times , if I add 1 to the freq at every apperance and subtract 1 for every appearance , than for sure element with high majority left with the greater frequency.