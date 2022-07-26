public class apna_college_patten {
    public static void main(String[] args) {
      int n =4;


        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }











//      for (int i=1; i<=n; i++){
//          for (int j=1; j<=n-i; j++){
//              System.out.print(" ");
//          }
//          for (int j=i; j>0; j--){
//              System.out.print(j);
//          }
//         for (int j=2; j<=i; j++){
//             System.out.print(j);
//         }
//          System.out.println();
//      }


     /* for(int i=1; i<=n; i++){
          for (int j=1; j<=n-i; j++){
              System.out.print(" ");
          }
          for (int j=1; j<=n; j++){
             if (i==1 || j==1 || i==n || j==n){
                 System.out.print("*");
             }
             else {
                 System.out.print(" ");
             }
          }
          System.out.println();
      }*/





      /*  for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }

            for (int k=0; k<2*(n-i); k++){
                System.out.print("   ");

            }

            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();

        }
        for (int i=n; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }

            for (int k=0; k<2*(n-i); k++){
                System.out.print("   ");

            }

            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();

        }


*/

    }
}
