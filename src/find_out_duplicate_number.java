public class find_out_duplicate_number {
    public static void main(String[] args) {
        int [] arr = {2,1,5,6,7,8,4,3,9};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]) {
                    System.out.println("the duplicate number is :" + arr[j]);
                }
            }
          }
        }
    }

