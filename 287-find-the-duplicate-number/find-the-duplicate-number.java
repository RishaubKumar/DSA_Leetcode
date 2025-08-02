class Solution {
    public int findDuplicate(int[] nums) {
        int freq[] = new int[nums.length];
        int result = 0;
        for(int i =0; i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i =0;i<freq.length;i++){
            if(freq[i]>=2){
                result = i;
            }
        }
        return result;
    }
}