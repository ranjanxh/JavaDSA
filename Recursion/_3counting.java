

public class _3counting {
    static int count=0;
    public static void counting(int n){
        if(count==n){
            return;
        }
        System.out.println(count);
        count++;
        counting(n);

    }
    public static void main(String[] args){
        counting(5);
    }
    
    
}
