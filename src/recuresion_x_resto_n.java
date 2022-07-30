public class recuresion_x_resto_n {
    public  static int printpower(int x,int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int power1 = printpower(x,n-1);
        int power = x * power1;
        return power;
    }
    public static void main(String[] args) {
        int x=4 , n=4;
        int ans = printpower(x,n);
        System.out.println(ans);
    }
}
