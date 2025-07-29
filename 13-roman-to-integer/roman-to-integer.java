class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));
            int next = 0;

            if (i + 1 < s.length()) {
                next = value(s.charAt(i + 1));
            }

            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        return sum;
    }

    private int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0; 
    }
}
// class Solution {
//     public int romanToInt(String s) {
//         int sum =0;
//         for(int i =0;i<s.length();i++){
//             char digit = s.charAt(i);
//             if(digit =='I'){
//                 sum += 1;
//                 if(i+1<s.length()&&s.charAt(i+1)== 'V'){
//                     sum +=3;
//                 }
//                 else if(i+1<s.length()&&s.charAt(i+1)== 'X'){
//                     sum +=8;
//                 }
//             }else if(digit =='V'){
//                 sum += 5;
//             }else if(digit =='X'){
//                 sum += 10;
//                 if(i+1<s.length()&&s.charAt(i+1)== 'L'){
//                     sum +=30;
//                 }else if(i+1<s.length()&&s.charAt(i+1)== 'C'){
//                     sum +=80;
//                 }
//             }else if(digit =='L'){
//                 sum += 50;
//             }else if(digit =='C'){
//                 sum += 100;
//                 if(i+1<s.length()&&s.charAt(i+1)== 'D'){
//                     sum +=300;
//                 }else if(i+1<s.length()&&s.charAt(i+1)== 'M'){
//                     sum +=800;
//                 }
//             }else if(digit =='D'){
//                 sum += 500;
//             }else if(digit =='M'){
//                 sum += 1000;
//             }
//         }
//         return sum;
//     }
// }