class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String complete = sb.toString().toLowerCase();
        for(int i =0;i<complete.length()/2;i++){
            if(complete.charAt(i)!=complete.charAt(complete.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}