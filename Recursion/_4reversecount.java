package Recursion;
public class _4reversecount{
    public static void printrev(int i, int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        printrev(i, n-1);
    }
    public static void main(String[] args) {
        printrev(1,8);
    }
    
}
