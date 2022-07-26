import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element : ");
        int a = sc.nextInt();
        int [] arr = new int[a];

        for (int j=0; j<a; j++){
            System.out.println("enter the number : ");
            arr[j] = sc.nextInt();
        }

        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n; i++){

          temp = arr[i];
          arr[i] = arr[l-1-i];
          arr[l-1-i] = temp;

        }
        for (int e:arr) {
            System.out.println(e);
        }
    }
}
