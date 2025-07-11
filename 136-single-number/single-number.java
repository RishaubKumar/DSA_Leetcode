class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int digit = 0;
        int max = nums[0],min = nums[0];
        for(int num : nums){
            if(num>max)
            max=num;
            if(num<min)
            min = num;
        }
        int freq[] = new int[max-min+1];
        for(int num : nums){
            freq[num-min]++;
        }
        for(int i =0;i<freq.length;i++){
            if(freq[i]==1)
              return i+min;
        }
        return -1;
    }
}