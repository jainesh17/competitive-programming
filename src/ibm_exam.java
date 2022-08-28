import java.util.Arrays;
import java.util.Scanner;

class ibm_exam {
    public static void str2(int[] arr1 ,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if ( Arrays.equals(arr1,arr2)){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i=0; i<n; i++){
             arr1[i] = sc.nextInt();

        }
        for (int i=0; i<n; i++){
             arr2[i] = sc.nextInt();

        }

        str2(arr1, arr2);

    }
}
