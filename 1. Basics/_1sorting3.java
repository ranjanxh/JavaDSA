import java.util.Arrays;

public class _1sorting3 {
    public static void main(String[] args) {
        int[] nums={54,21,-8,89,751};
        //selectSort(nums);
        // nums[0]=0;
        // System.out.println(nums);
        //bubble(nums);
        System.out.println(Arrays.toString(nums));
        insertionsort(nums);
        
        System.out.println(Arrays.toString(nums));

        
    }
    public static void selectSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int mini=i;
            for(int j=i;j<nums.length;j++){
                if(nums[mini]>nums[j]){
                    mini=j;
                }
                
            }
            int temp=nums[mini];
            nums[mini]=nums[i];
            nums[i]=temp;
            
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void bubble(int[] nums){
        for(int i=nums.length-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    didSwap++;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void insertionsort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }

        }
        
        System.out.println(Arrays.toString(nums));

    }
    
}

