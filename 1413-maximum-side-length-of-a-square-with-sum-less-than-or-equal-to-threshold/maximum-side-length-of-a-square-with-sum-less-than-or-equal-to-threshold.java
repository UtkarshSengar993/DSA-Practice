class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] presum = new int[m + 1][n + 1];

        // Prefix sum
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                presum[i][j] = presum[i - 1][j] + presum[i][j - 1]
                        - presum[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }

        int max = 0;

        for (int side = 1; side <= Math.min(m, n); side++) {
            boolean found = false;

            for (int i = 0; i + side <= m; i++) {
                for (int j = 0; j + side <= n; j++) {

                    int sum = presum[i + side][j + side]
                            - presum[i][j + side]
                            - presum[i + side][j]
                            + presum[i][j];

                    if (sum <= threshold) {
                        max = side;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }
        return max;
    }
}
