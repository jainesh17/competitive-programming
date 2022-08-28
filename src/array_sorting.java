import java.util.Arrays;

public class array_sorting {
    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 3, 6};
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(arr[arr.length-2]);


    }
}
