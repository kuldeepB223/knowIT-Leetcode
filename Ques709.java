public class Ques709 {
    public static void main(String[] args) {
        String s= "HeLLo";
        doRev(s);
    }
    public static void doRev(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >=65 && arr[i]<=90){
                arr[i]+=32;
            }
        }
        System.out.println();
    }
}
