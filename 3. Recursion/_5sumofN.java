public class _5sumofN {
    public static void main(String[] args) {
        summer(5, 0);
        
    }
    public static void summer(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        summer(n-1,sum+n);
        

    }
    
}
