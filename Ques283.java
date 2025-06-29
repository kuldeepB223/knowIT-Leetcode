public class Ques283 {
    public static void moveZeroes(int[] nums) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
         while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]+" ");
        }
        System.out.println();
         System.out.println("****************");
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        
        
        System.out.println("from Main");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }System.out.println();
         System.out.println("****************");

        moveZeroes(nums);
       
    }
}
