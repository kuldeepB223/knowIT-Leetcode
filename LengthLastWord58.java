public class LengthLastWord58 {

    public static int LOL(String s){
        int cnt=0;
        s=s.trim();
        String[] str=s.split("\\s+ ");
        int len=s.length();
        String st = str[len-1];
        for(int i=0; i<st.length(); i++){
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int c = LOL("    kuldeep       Hello World");
        System.out.println("Count of characters of last word - "+c);
    }
}
