import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        
        // Step 1: Sort based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            
            // Check overlap
            if (intervals[i][0] <= current[1]) {
                // Merge
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap → add current
                result.add(current);
                current = intervals[i];
            }
        }

        // Add last interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}
