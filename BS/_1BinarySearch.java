import java.util.*;

public class _1BinarySearch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Size of array");

        int n=s.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("tartget");
        int target=s.nextInt();
        //binary search
        System.out.println(BinarySearch(arr1, n, target));
        
        
        
    }
    public static int BinarySearch(int[] arr, int n, int target){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;

            if (arr[mid]==target){
                return mid;

            } 
            else if(mid>target) {
                end=mid-1;}
            else {
                start=mid+1;}

        }
        return -1;


    }
}