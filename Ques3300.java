public class Ques3300 {

    public static int minElement(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int sum=0;
            while(n != 0){
                int rem=n%10;
                n=n/10;
                sum=sum+rem;
            }
            arr[i]=sum;
        }
        int s = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<s)
                s=arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr= {10,20,30,40};
        int num = minElement(arr);
        System.out.println(num);
    }

}
