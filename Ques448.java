import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Ques448 {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,3,2,1};
        find(nums);
        
    }
    public static List<Integer> find(int[] nums){
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        for(int i=1; i<=nums.length; i++){
            lst.add(i);
        }
        for(int i=1; i<nums.length; i++){
            if(lst.contains(nums[i])){
                lst.remove(i);
            }
        }
        return lst;
    }
}
