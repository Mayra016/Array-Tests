class MergeArrays {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = 0;
        int end = 0;
        int x = 0;

        if (intervals.length < 1) {
            int[][] result = new int[1][newInterval.length];
            result[0] = newInterval;
            return result;
        }

        if ( intervals[intervals.length - 1][1] < newInterval[0] ) {
            int[][] result = new int[intervals.length + 1][newInterval.length];

            for (int i = 0; i < intervals.length; i++) {
                result[i] = intervals[i];
            }
            
            result[result.length - 1] = newInterval;
            return result;
        }

        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[0] >= intervals[i][0]) {
                start = i;
            }

            if (newInterval[1] < intervals[start][1]) {
                end = i;
                break;
            }

            if (newInterval[1] <= intervals[i][1]) {
                end = i - 1;
            }
        }


        int[][] updatedInterval = new int[intervals.length - (end - start)][2];

        for (int i = 0; i < intervals.length; i++) {
            if (i < start || i > end) {
                updatedInterval[x][0] = intervals[i][0];
                updatedInterval[x][1] = intervals[i][1];
                x++;
            }
            
            if (i == start) {
                updatedInterval[x][0] = intervals[i][0] < newInterval[0] ? intervals[i][0] : newInterval[0];
            }

            if (i == end) {
                updatedInterval[x][1] = intervals[i][1] > newInterval[1] ? intervals[i][1] : newInterval[1];
                x++;
            }
        }   

        return updatedInterval;
    }
}
