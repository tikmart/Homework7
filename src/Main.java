import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5};
        int t = 0; // temp value
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                t = arr[i];
                arr[i] = arr[index];
                arr[index] = t;
                index--;
            }

        }

        System.out.println(Arrays.toString(arr));


    }
}