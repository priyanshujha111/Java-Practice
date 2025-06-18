public class towleve {
    
    public static void main(String[] args) {
        
        int[][] arr = {
            {4,1},
            {1,3},
            {6,2}
        };

        
        int rows = arr.length;
        int cols = arr[0].length;

        
        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += arr[row][col];
            }
            System.out.println("Sum of column " + (col + 1) + ": " + sum);
        }
    }
}

    

