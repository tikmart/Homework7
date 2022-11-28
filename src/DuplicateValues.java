public class DuplicateValues {
    public static void main(String[] args) {
        int[][] matrix = {{1, 63, 24, 1, 1}, {45, 1, 25,6}, {24, 69, 82}};
        boolean noDuplicates = true;


        for (int i = 0; i < matrix.length; i++) {
            int[] temp = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                temp[j] = matrix[i][j];
            }
            for (int m = 0; m < temp.length; m++){
                for (int j =0; j < matrix.length; j++) {
                    for (int k = 0; k < matrix[j].length; k++) {
                        if (temp[m] == matrix[j][k] && k > m){
                            noDuplicates = false;
                            System.out.println(temp[m] + " is duplicate at index: [" + i + " , " + k + "]");
                            break;
                        }
                    }

                }
            }
        }
        if (noDuplicates)
            System.out.println("There are no duplicates in the array");
    }
}
