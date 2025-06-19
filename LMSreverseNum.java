public class LMSreverseNum {
    public static void main(String[] args) {
        int num = 7894;
        System.out.println("no-> "+num);
        int a = RevNum(num);
        System.out.println("rev no-> "+a);
        
    }
    public static int RevNum(int n){
        int rev=0;
        while(n != 0){
            int rem=n%10;
            n=n/10;
            rev=(rev*10)+rem;
        }
        return rev;
    }
}
