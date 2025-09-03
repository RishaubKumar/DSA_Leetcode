class Solution {
    public boolean isPowerOfTwo(int n){
        if(n==0) return false;
        if(n==1) return true;
        if(n%2 !=0)return false;
        return isPowerOfTwo(n/2);
    }
    // public boolean isPowerOfTwo(int n) {
    //     for(int i =0;pow(i)<=n;i++){
    //         if(pow(i)==n){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // public static int pow(int x){
    //     if(x==0){
    //         return 1;
    //     }
    //     return 2*pow(x-1);
    // }
}