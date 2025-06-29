
import java.util.Arrays;

public class Ques268 {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums={0,1};
        System.out.println(missingNumber(nums));
    }
}

// List<Integer> list = new ArrayList<>();
//         for(int i=0; i<nums.length; i++){
//             list.Add(i+1, nums[i]);
//         }
//         for(int j=0; j<nums.length; j++){
//             list.contains(j);
//         }
