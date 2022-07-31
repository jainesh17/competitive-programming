public class recursion_move_char {
    public static void movechar(String str,int idx,int count,String newstr){
        if (idx==str.length()){
            for (int i=0; i<count; i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar=='x'){
            count++;
            movechar(str,idx+1,count,newstr);
        }
        else {
            newstr += currchar;
            movechar(str,idx+1,count,newstr);
        }
    }
    public static void main(String[] args) {
       String str = "axbcxxd";
       movechar(str,0,0,"");
    }
}
