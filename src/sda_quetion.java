import java.util.Scanner;

public class sda_quetion {
    public static void main(String[] args) {


//***********************************************************************************************************************************************
        // find out  min max number in array

   /*  Scanner sc = new Scanner(System.in);
        System.out.print("enter the element : ");
        int element = sc.nextInt();

        int [] array = new int[element];
        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;



        for (int i=0; i<element; i++){
            System.out.print("enter the number ");
            array[i] = sc.nextInt();

        }
        for (int i=0; i<element; i++){
            if (array[i]>=max){
                max = array[i];

            }
            if (array[i]<=min){
                min = array[i];
            }
        }


        System.out.println("the max element is : " + max);
        System.out.println("the min element is : " + min);*/
//***********************************************************************************************************************************************
        // reverse the array
    /*    Scanner sc = new Scanner(System.in);
        System.out.print("enter the element :");
        int element = sc.nextInt();
        int [] arr = new  int[element];

        for (int j=0; j<element; j++) {
            System.out.print("enter the number : ");
            arr[j] = sc.nextInt();

        }
            int temp;
            int l = arr.length;
            int n = Math.floorDiv(l,2);

            for (int i=0; i<n; i++){
                temp = arr[i];
                arr[i] = arr[l-1-i];
                arr[l-1-i] = temp;
            }

            for (int e:arr) {
                System.out.print(e + " ");

            }
*/
//***********************************************************************************************************************************************
       /* Scanner sc = new Scanner(System.in);
        System.out.print("enter the element :");
        int element = sc.nextInt();
        int [] arr = new  int[element];

        for (int i=0; i<element; i++) {
            System.out.println("enter the number");
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<element; i++) {
            for (int j=i+1; j<element; j++){
                if (arr[i]==arr[j]) {
                    System.out.println(true);
                }

            }
        }*/
//***********************************************************************************************************************************************
      // reverse String

     /* StringBuilder sb = new StringBuilder("jainesh");

      for ( int i=0; i<sb.length()/2; i++){
          int front = i;
          int back = sb.length()-1-i;

          char frontchar = sb.charAt(front);
          char backchar = sb.charAt(back);

          sb.setCharAt(front,backchar);
          sb.setCharAt(back, frontchar);
      }
        System.out.println(sb);*/

//************************************************************************************************************************************************
  //  array sum


       /* Scanner sc = new Scanner(System.in);
        System.out.print("enter the element :");
        int element = sc.nextInt();
        int [] arr = new  int[element];
        int sum =0;
        for (int i=0; i<element; i++){
            System.out.println("enter the number");
            arr[i] = sc.nextInt();
             sum += arr[i];
        }
           System.out.println(sum);
*/

//************************************************************************************************************************************************



      }
    }

