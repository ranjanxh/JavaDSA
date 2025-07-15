

public class _6backntoone {
    public static void printntoone(int i, int n){
        if(i>n){
            return;
        }
        printntoone(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printntoone(1, 10);
    }
    
}
