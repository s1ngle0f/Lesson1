import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 6, 7};
        int[] arr2 = new int[]{1, 2, 2, 2};
        arr1[0] = arr2[0];
        System.out.println(arr2[0]);

    }
}