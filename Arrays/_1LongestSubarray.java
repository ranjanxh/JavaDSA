import java.util.Arrays;
import java.util.Scanner;

public class _1LongestSubarray {
    //Brute force
    public static void main(String[] args) {
        int[] arr1=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr1.length;j++){
                System.out.print(arr1[j]+" ");
            }System.out.println();
        }
        
    }
    
    
}
