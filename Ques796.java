

public class Ques796{
    public static boolean rotateString(String s, String goal) {
        // char[] arr = s.toCharArray();
        int low=0, high=s.length()-1;
        while(low<high){
            if(!s.equals(goal)){
                char temp = s.charAt(low);
                s=s+temp;
                System.out.println(s);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean ans = rotateString("abcde", "cdeab");
        System.out.println("this is answer -----  "+ans);
    }
}