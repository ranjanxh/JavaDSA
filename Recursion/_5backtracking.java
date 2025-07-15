

public class _5backtracking {
    public static void back(int i,int n){
        if(i<1){
            return;
        }
        back(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        back(10, 10);
    }
    
}
