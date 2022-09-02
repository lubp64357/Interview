package Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        for(int i = 0; i < k;i++){
            reverse(nums);
            for(int j = 1; j <= nums.length / 2; j++){
                swap(nums, j, nums.length-j);
            }
        }
    }
    public void reverse(int[] nums){
        for(int i = 0; i < nums.length / 2; i++){
            int tmp;
            tmp = nums[i];
            nums[i]= nums[nums.length - 1 - i];
            nums[nums.length - 1 - i]= tmp;
        }
    }
    public void swap(int[] nums, int j, int k){
        int tmp;
        tmp = nums[j];
        nums[j]= nums[k];
        nums[k]= tmp;
    }

}