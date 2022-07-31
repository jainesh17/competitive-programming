public class recursion_reverse_string {
    public static void printreversestr(String str ,int idx){
        if (idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printreversestr(str,idx-1);
    }
    public static void main(String[] args) {
        String str = "jainesh";
        printreversestr(str,str.length()-1);

    }
}
