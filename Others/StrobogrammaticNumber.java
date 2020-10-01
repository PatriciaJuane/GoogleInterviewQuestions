class Solution {
    public boolean isStrobogrammatic(String num) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num.length(); i++) {
            char c = num.charAt(i);
            if(c == '2' || c == '4' || c == '5' || c == '7' || c == '3') return false;
            else if (c == '6') sb.insert(0,'9');
            else if (c == '9') sb.insert(0,'6');
            else sb.insert(0,c); // casos 0 y 1
        }
        return sb.toString().equals(num); // true o false
    }
}