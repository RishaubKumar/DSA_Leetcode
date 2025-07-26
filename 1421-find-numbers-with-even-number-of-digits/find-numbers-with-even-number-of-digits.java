class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
            int sum =0;
        for(int j =0;j<n;j++){
            int count =0;
            int num = nums[j];
            if(num == 0){
                count =1;
            }else{
            while(num != 0){
                num = num / 10;
                count++;
        }
            if(count % 2 ==0){
                sum++;
            }}
        }
        return sum;

    }
}