class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = nums[0],max = nums[0],n = nums.length;
        for(int num : nums){
            if(num<min){
                min = num;
            }if(num>max){
                max = num;
            }
        }
        int shift = -min;
        int size = max - min + 1;
        int freq[] = new int[size];
        for(int num : nums){
            freq[num+shift]++;
        }
        for (int i = 0; i < size; i++) {
            if (freq[i] > n / 3) {
                list.add(i - shift); 
            }
        }
        return list;
    }
}