package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapping {
    public static int[][] merge(int[][] intervals) {

        // it will be our answer
        List<int[]> result = new ArrayList<>();

        // checking empty intervals
        if (intervals.length == 0 || intervals == null) {
            // return empty intervals
            return result.toArray(new int[0][]);
        }

        // first sort in ascending order
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        System.out.println("Size " + intervals.length);
        System.out.println("END  " + end + "    INTERVERLS   " + intervals[0][1]);
        System.out.println("START  " + start + "    INTERVERLS    " + intervals[0][0]);

        // i = row
        int i = 1;
        while (i < intervals.length) {

            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {

                // if merge not possible , then insert prev interval into list
                result.add(new int[]{start, end});
                // reassign to the intervals
                start =intervals[i][0];
                end = intervals[i][1];
            }

            i++;
        }

        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };


        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
