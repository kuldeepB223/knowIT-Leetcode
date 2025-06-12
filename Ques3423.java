

public class Ques3423 {
    public static void main(String[] args) {
        int[] arr={1,2,4};
        int s = arr.length;
        int diff=0;
        for(int i=0; i<s; i++){
            int nxt=(i+1)%s;
            //diff= Math.max(diff, arr[i]-arr[nxt]);
            if(arr[i]-arr[nxt]>diff){
                diff=arr[i]-arr[nxt];
            }
        }
        System.out.println(diff);
    }
}
        // int i=0, n=nums.length, diff=1;
        // while(i+1%n!=0){
        //     if((nums[i]-nums[i+1%n])>diff){
        //         diff=nums[i]-nums[i+1%n];
        //         i++;
        //     }else{
        //         i++;
        //     }
        // }
        // System.out.println("  -->  "+diff);