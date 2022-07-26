import java.util.Scanner;

public class find_the_String_in_duplicate_char {
    public static void main(String[] args) {
//        String str = " find out duplicate char in String";

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the String : ");
        String str = sc.nextLine();
        char[] carray = str.toCharArray();
        System.out.println("the string is " + str);
        System.out.print("the String in a duplicate char is:");
        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                if (carray[i]==carray[j]){
                    System.out.print("  " + carray[j]);
                    break;
                }
            }
        }
    }
}
