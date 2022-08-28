import java.util.Arrays;
import java.util.Scanner;

class String_char_comperision {
    public static void str2(String str, int idx ,String inputstr){
       char [] st1 = str.toCharArray();
       char [] st2 = inputstr.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
       if ( Arrays.equals(st1,st2)){
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();

        str2(str,0,str1);

    }
}
