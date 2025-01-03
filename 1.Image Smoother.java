class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;       // Number of rows
        int n = img[0].length;    // Number of columns
        int[][] result = new int[m][n]; // Resultant smoothed image
        
        // Iterate through each cell in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;      // Sum of valid neighbors
                int count = 0;    // Count of valid neighbors

                // Iterate through the 3x3 grid around the cell (i, j)
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        // Check if (x, y) is within bounds
                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            sum += img[x][y];
                            count++;
                        }
                    }
                }
                
                // Compute the average and floor it
                result[i][j] = sum / count;
            }
        }

        return result;

    }
}