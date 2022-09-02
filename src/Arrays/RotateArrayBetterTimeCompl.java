package Arrays;

public class RotateArrayBetterTimeCompl {
    public void rotate(int[] nums,int k ){
        k = k % nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k -1);
        reverse(nums, k , nums.length - 1 );

    }
    public void reverse(int[] nums, int start, int end){
        int low = start, high = end;

        while(low < high){
            swap(nums, low, high);
            high--;
            low++;
        }
    }

    public void swap(int[] a, int i, int j){
        int tmp = a[j];
        a[j] = a[i];
        a[i]= tmp;
    }
}
