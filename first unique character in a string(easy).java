class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char count=s.charAt(i);
            if(s.indexOf(count)==s.lastIndexOf(count)){
                return i;
            }
        }
        return -1;
    }
}

