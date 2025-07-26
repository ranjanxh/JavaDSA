public class _3ntoone {
    public static void main(String[] args) {
        ntoone(15);
        
    }
    public static void ntoone(int initial){
        if(initial<0){
            return;
        }
        System.out.println(initial);
        ntoone(initial-1);

    }
    
}
