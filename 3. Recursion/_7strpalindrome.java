public class _7strpalindrome {
    public static void main(String[] args) {
        String s="naman";
        System.out.println(strpalin(s, 0));
        

    }
    public static boolean strpalin(String str,int i){
        int n=str.length();
        if (i >= n / 2) return true;
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
            
        }
        return strpalin(str, i+1);
        
        
        

        

    }
    
}
