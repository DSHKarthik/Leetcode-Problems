class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total = rows * cols;
        int[][] result = new int[total][2];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = rStart, c = cStart;
        int count = 0;
        result[count][0] = r;
        result[count][1] = c;
        count++;
        int steps = 1;
        int dir = 0;
        while (count < total) {
            for (int twice = 0; twice < 2; twice++) {
                for (int s = 0; s < steps; s++) {
                    r += dr[dir];
                    c += dc[dir];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[count][0] = r;
                        result[count][1] = c;
                        count++;
                    }
                }
                dir = (dir + 1) % 4;
            }
            steps++;
        }
        return result;
    }
}