package Day3;

public class search2D_Matrix {
    boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;


        int low = 0;
        // last idx
        int high = (row * col) - 1;


        while (low <= high) {
            int mid = (low + (high - low) + 1);
            if (matrix[mid / col][mid % col] == target) {
                return true;
            }

            if (matrix[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return false;


    }
}
