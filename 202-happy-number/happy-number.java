class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true; // direct check for 1

        int temp = n;
        boolean happyNum = false;

        while (temp != 1 && temp != 4) {
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                temp = temp / 10;
                sum += digit * digit;
            }
            if (sum == 1) {
                happyNum = true;
                break;
            } else {
                temp = sum;
            }
        }
        return happyNum;
    }
}