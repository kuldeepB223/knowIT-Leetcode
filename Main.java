import java.util.Stack;

public class Main{

    
        public boolean isPalindrome(String s) {
            Stack<Character> stk = new Stack<>();

                for(int k=0; k<s.length(); k++){
                    if(s.charAt(k) >= 65 && s.charAt(k)<=90 || s.charAt(k)>=97 && s.charAt(k)<=122){    
                        stk.push(s.charAt(k));
                    }
                }

                
            return false;
        }
    

    public static void main(String[] args) {
        boolean abc = isPalindrome("race a car");

    }
}