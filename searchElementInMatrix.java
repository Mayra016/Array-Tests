public class SearchElementInMatrix {
	public static void main(String[] args) {
	    int[] nums = {1,3,-1,-3,5,3,6,7};
	    int[][] matrix = { {1, 4, 7, 11, 15},
    {2, 5, 8, 12, 19},
    {3, 6, 9, 16, 22},
    {10, 13, 14, 17, 24},
    {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(matrix, 5));
    }
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < n; x++) {
                if (matrix[i][x] == target) {
                    return true;
                }
            } 
        }

        return false;
    }
}    
