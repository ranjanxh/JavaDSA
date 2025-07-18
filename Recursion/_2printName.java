

public class _2printName {
    
    static int count=0;
    public static void print(){
        if(count==5){
            return;
        }String ame="Himanshu";
       
        char a=ame.charAt(1);
        System.out.println(a);
        count++;
        print();


    }
    public static void main(String[] args) {
        print();
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        _2printName.count = count;
    }
    
}
