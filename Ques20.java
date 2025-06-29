import java.util.Stack;

public class Ques20 {
    
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ){
                stk.push(s.charAt(i));   
            }else{
                if(stk.empty()){ 
                    return false;
                }

                char top = stk.pop();
                if((s.charAt(i)==')'&& top != '(') || (s.charAt(i)=='}' && top != '{') || (s.charAt(i)==']' && top != '[') ){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Ques20 q20 = new Ques20();
        String s = "]"; //"({[()]})"; //"(){}[]";
        System.out.println(q20.isValid(s));
    }
}


    
