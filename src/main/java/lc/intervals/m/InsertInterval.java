package lc.intervals.m;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    // O(n) O(n)
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> mergedIntervals = new ArrayList<>();
            boolean inserted = false;
            for (int[] interval : intervals) {
                if (interval[1] < newInterval[0])
                    mergedIntervals.add(interval);
                else if (interval[0] > newInterval[1]) {
                    if (!inserted) {
                        mergedIntervals.add(newInterval);
                        inserted = true;
                    }
                    mergedIntervals.add(interval);
                } else {
                    newInterval[0] = Math.min(interval[0], newInterval[0]);
                    newInterval[1] = Math.max(interval[1], newInterval[1]);
                }
            }
            if (!inserted)
                mergedIntervals.add(newInterval);
            return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }

    public static void main(String[] args) {
        var ii = new InsertInterval();
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = ii.insert(intervals, newInterval);
        for (int i = 0; i < result.length; i++) {
            System.out.print("[");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
    }
}
