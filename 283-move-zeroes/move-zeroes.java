class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0 ;i<n;i++){
            if(nums[i] == 0){
                int temp = nums[i];
                for(int j =i;j<n-1;j++){
                nums[j]= nums[j+1];
                }
                nums[n-1] = temp;
                n--;
                i--;
            } 
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
    Solution sol = new Solution();
        sol.moveZeroes(nums);
    }
}