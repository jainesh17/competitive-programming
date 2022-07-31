public class recursion2_tower_of_hanoi {
    public static void print_tower_of_hanoi(int n,String src,String helper,String dest){
        if (n==1){
            System.out.println("transfer " + n + " from " +src + "to " + dest);
            return;
        }
        print_tower_of_hanoi(n-1,src,dest,helper);
        System.out.println("transfer " + n + " from " +src + "to " + dest);
        print_tower_of_hanoi(n-1,helper,src,dest);

    }
    public static void main(String[] args) {
        int n =3;
        print_tower_of_hanoi(n," S "," H "," D ");
    }
}
