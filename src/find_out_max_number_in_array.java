import java.util.Scanner;

public class find_out_max_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element : ");
        int element = sc.nextInt();

        int [] arr = new int[element];
           int max = arr[0];

          for (int i=0; i<element; i++){
              System.out.println("enter the number : ");
              arr[i] = sc.nextInt();
              if (arr[i]>max){
                  max = arr[i];
              }
//             else {
//                  System.out.println("the largest element is :"+ arr[0]);
//              }

          }
        System.out.print("the largest element is :" + max);

    }
}
