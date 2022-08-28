import java.util.Scanner;

public class hackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String r = new StringBuilder(str).reverse().toString();
        if (str.equals(r)==true){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
