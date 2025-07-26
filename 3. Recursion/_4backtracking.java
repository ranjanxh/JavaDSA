public class _4backtracking{
    public static void main(String[] args) {
        
        backing(5, 5);
    }
    public static void backing(int i,int n){
        if(i<1){
            return;
        }
        backing(i-1, n);
        System.out.println(i);
    }
}