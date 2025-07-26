import java.util.Arrays;

public class _6reverse {
    public static void main(String[] args) {
        int[] aar1={1,2,3,4,5};
        System.out.println(Arrays.toString(aar1));
        reverse(aar1, 0, aar1.length-1);
        
    }
    public static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void reverse(int[] nums,int l,int r){

        if(l>=r){
            System.out.println(Arrays.toString(nums));
            return;
        }
        swap(nums,l,r);
        reverse(nums, l+1, r-1);
    }
    
}
