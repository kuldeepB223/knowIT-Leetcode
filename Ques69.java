public class Ques69 {
    public static void main(String[] args) {
        int x=8;
        int low=1;
        int high=x, ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==x){
                ans=mid;
                System.out.println(mid+"  if");
                break;
            }else if(mid*mid<x){
                ans=mid;
                System.out.println(mid+"  else if");
                low=mid+1;
            }else{

                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
