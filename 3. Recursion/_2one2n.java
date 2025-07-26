public class _2one2n {
    public static void main(String[] args) {
        one2n(1, 10);
        
    }
    public static void one2n(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        one2n(i+1, n);
    }
    
}
