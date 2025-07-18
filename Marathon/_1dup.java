class _1dup {
    public static boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            if(nums[low]==nums[high]){
                return true;
            }low++;
            high--;
        }
        return false;
    
    }
    public static void main(String[] args) {
        int[] arr1={1,5,-2,-4,0};
        System.out.println(containsDuplicate(arr1));


    }
}