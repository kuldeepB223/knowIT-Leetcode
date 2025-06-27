public class GFGque2 {
    public static int findOne(String s) {
         int one=-1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                one=i;
            }
        }
        return one;
    }
    public static void main(String[] args) {
        String s = "0001357616148";
        int a = findOne(s);
        System.out.println("Last index of 1 is -> "+a);
    }
}
