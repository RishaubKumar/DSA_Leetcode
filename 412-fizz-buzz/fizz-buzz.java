class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
// class Solution {
//     public List<String> fizzBuzz(int n) {
//        List<String> list = new ArrayList<>();
//        for(int i =1;i<=n;i++){
//         int count =0,sum =0,num =i;
//         while(num != 0){
//             sum += num%10;
//             num = num/10;
//         }
//         if(sum % 3==0){
//             if(i % 10 ==0 || i % 10 == 5){
//                 list.add("FizzBuzz");
//             }
//             list.add("Fizz");
//         }else if(i % 10 ==0 || i % 10 == 5){
//             list.add("Buzz");
//         }else{
//             list.add(String.valueOf(i));
//         }
//        } 
//        return list;
//     }
// }