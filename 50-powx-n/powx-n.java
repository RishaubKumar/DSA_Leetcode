class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        // Handle the case when n is Integer.MIN_VALUE to avoid overflow
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        double currentProduct = x;
        
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }
        
        return result;
    }
}
// class Solution {
//     public double myPow(double x, int n) {
//         double Result = 1;
//         int minN = 0;
//         if(minN>n){
//             minN =n;
//             for(int i = minN;i<0;i++){
//             Result = Result*x;
//             }
//             Result = 1/Result;
//         }else{
//         for(int i = minN;i<n;i++){
//             if(n==0){
//                 Result = 1;
//             }
//             Result = Result*x;

//         }
//             }
//         return Result;
//     }
// }