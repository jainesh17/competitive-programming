

public class booble_sort {


    public static void main(String[] args) {

        // bubble sort

        int arr[] = {1,8,3,2,7,9,6,5};
        for (int i=0; i<=arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                int temp;
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
            System.out.println();
        System.out.println(arr[arr.length-2]);

    }
}
