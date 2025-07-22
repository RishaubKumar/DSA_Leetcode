class Solution {
    public static String padWithZeros(String str, int targetLength) {
        while (str.length() < targetLength) {
            str = "0" + str;
        }
        return str;
    }
    
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        StringBuilder result = new StringBuilder();
        char carry = '0';
        int highVal = Math.max(n, m);
        
        if (n < highVal) {
            a = padWithZeros(a, highVal);
        }
        if (m < highVal) {
            b = padWithZeros(b, highVal);  // Fixed variable name from str2 to b
        }
        
        for (int i = highVal - 1; i >= 0; i--) {  // Fixed loop condition and index
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);
            
            if (aChar == '0' && carry == '0') {
                if (bChar == '0') {
                    result.append('0');
                } else {
                    result.append('1');
                }
            } else if (aChar == '1' && carry == '0') {
                if (bChar == '0') {
                    result.append('1');
                } else {
                    result.append('0');
                    carry = '1';
                }
            } else if (aChar == '0' && carry == '1') {
                if (bChar == '0') {
                    result.append('1');
                    carry = '0';
                } else {
                    result.append('0');
                    carry = '1';
                }
            } else {  // aChar == '1' && carry == '1'
                if (bChar == '0') {
                    result.append('0');
                    carry = '1';
                } else {
                    result.append('1');
                    carry = '1';
                }
            }
        }
        
        if (carry == '1') {
            result.append('1');
        }
        
        return result.reverse().toString();  // Reverse to get correct order
    }
}