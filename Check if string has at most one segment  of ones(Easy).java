class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0; //Initialized count

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i)!=s.charAt(i-1)) {
                count++; 
            }
            if(count>1) {
                return false;class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0; //Initialized count

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i)!=s.charAt(i-1)) {
                count++; //Increase count when bit changes
            }
            if(count>1) {
                return false; //Return false when count > 1
            }
        }
        return true;
    }
}
            }
        }
        return true;
    }
}
