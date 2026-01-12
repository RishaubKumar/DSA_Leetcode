class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;

        int i = 0;   

        while (i < points.length - 1) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];

            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);

            if (dx == 0) {
                count += dy;
            } else if (dy == 0) {
                count += dx;
            } else {
                count += Math.max(dx, dy);
            }

            i++;
        }

        return count;
    }
}
