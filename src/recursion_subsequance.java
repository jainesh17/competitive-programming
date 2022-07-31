public class recursion_subsequance {
    public static void subsequaance(String str,int idx,String newstr){
        if (idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        subsequaance(str,idx+1,newstr+currchar);
        subsequaance(str,idx+1,newstr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequaance(str,0,"");
    }
}
