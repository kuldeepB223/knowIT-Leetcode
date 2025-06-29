public class Ques189 {
     public static void rotate(int[] nums, int k) {
        int s = nums.length;
        int[] arr=new int[s];
        
        for(int i=0; i<nums.length; i++){
            arr[(i+k)%s]=nums[i];
        }

        for (int i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
}
