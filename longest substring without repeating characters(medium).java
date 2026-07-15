class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] lastIndex = new int[256];

        // initialize all to -1
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // if character already seen, move start
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }

            lastIndex[c] = i;

            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
