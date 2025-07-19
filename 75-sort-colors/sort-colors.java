class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            for(int j =0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        // int n = nums.length;
        // int sortColor[] = new int[n];
        // ArrayList<Integer> red = new ArrayList<>();
        // ArrayList<Integer> white = new ArrayList<>();
        // ArrayList<Integer> blue = new ArrayList<>();
        // for(int i =0;i<n;i++){
        //     if(nums[i]==0){
        //         red.add(nums[i]);
        //     }else if(nums[i]==1){
        //         white.add(nums[i]);
        //     }else{
        //         blue.add(nums[i]);
        //     }
        // }
        // for(int i =0;i<n;i++){
        //     if(red.size()-1 != 0){
        //     sortColor[i] = red.get(i);
        //     }else if(white.size()-1 != 0){
        //     sortColor[i] = white.get(i);
        //     }else if(blue.size()-1 != 0){
        //     sortColor[i] = blue.get(i);
        //     }
        // }
        //         for(int i =0;i<n;i++){
        //     System.out.println(sortColor[i]) ;       }
    }
}