public class Ques9 {
    public static void main(String[] args) {
        int x = 1221;

        int n = x, rev=0;
        while(n != 0){
            int r=n%10;
            n=n/10;
            rev=(rev*10)+r;
        }
        if(rev==x){
            System.err.println(x+" is palindrom ");
        }else{
            System.out.println(x+" is not palindrom");
        }
    }
}
