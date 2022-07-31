import java.util.HashSet;

public class recursion_subsequance_same_char {
    public static void subsequaance(String str,int idx,String newstr, HashSet<String> set){

        if (idx==str.length()){
            if (set.contains(newstr)){
                return;
            }
            else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currchar = str.charAt(idx);

        subsequaance(str,idx+1,newstr+currchar,set);
        subsequaance(str,idx+1,newstr,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
       subsequaance(str,0,"",set);
    }

  
}
