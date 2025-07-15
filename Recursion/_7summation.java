
public class _7summation {
    static int sum=0;
    public static void summ(int i,int n){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        summ(i+1, n);

    }
    public static void main(String[] args) {
        summ(1, 10);
    }
    
}
