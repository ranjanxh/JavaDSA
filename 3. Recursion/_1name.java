public class _1name {
    public static void main(String[] args) {
        namecall(1, 5);

        
    }
    public static void namecall(int i,int n){

        if(i>n){
            return;
        }
        System.out.println("Himanshu");
        namecall(i+1, n);
        
    }
    
}
