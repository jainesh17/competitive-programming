public class recursion_metrics {
    public static int countpath(int i,int j,int n,int m){
        if (i==n || j==m){
            return 0;
        }
        if (i==n-1 && j==m-1){
            return  1;
        }
        int downpath = countpath(i+1,j,n,m);
        int rightpath = countpath(i,j+1,n,m);
        return downpath+rightpath;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int totalpath = countpath(0,0,m,n);
        System.out.println(totalpath);
    }
}
