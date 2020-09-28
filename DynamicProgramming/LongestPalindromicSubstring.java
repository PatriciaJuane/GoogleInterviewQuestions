class Solution {
    
    int max = 0;
    String result = "";
    
    
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++) { 
            palindromeCheck(s,i,i); // babad
            palindromeCheck(s,i,i+1); // cbbd
        }
        return result;
    }    
    
    private void palindromeCheck(String str, int i, int j) {     
        while(i>=0 && j<str.length() && str.charAt(i) == str.charAt(j)) {
            String substring = str.substring(i,j+1);
            int len = substring.length(); 
            if(len > max) {
                max = len;
                result = substring;
            }
            i--;
            j++;
        }
        
    }
    
}