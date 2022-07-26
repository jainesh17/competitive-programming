import java.util.Scanner;

public class string_find_out_same_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first String : ");
        String str1 = sc.nextLine();

        System.out.println("enter the second string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)==true){
            System.out.println("the string is same");
        }
        else {
            System.out.println("the string is not same");
        }

    }
        }
