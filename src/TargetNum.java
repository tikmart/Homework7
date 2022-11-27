import java.util.Scanner;

public class TargetNum {
    public static void main(String[] args) {
        int[][] matrix = {{12, 63, 24}, {45, 1, 25,6}, {7, 36, 82}};
        boolean notFound = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input target number: ");
        int t = sc.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] == t){
                    System.out.println("The number is at indexes of: " + i + " and " + j);
                    notFound = false;
                }
            }
        }
        if (notFound)
            System.out.println("Number not found");

        sc.close();
    }

}
