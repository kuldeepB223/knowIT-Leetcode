

public class findDiff {

    public static char Fdiff(String s, String t){
        
        // ArrayList<Character> list = new ArrayList<>();

        // for(int i=0; i<s.length(); i++){
        //     list.add(s.charAt(i));
        // }
        // char ch=' ';
        // for(int j=0; j<t.length(); j++){
        //     ch = t.charAt(j);
        //     if(!list.contains(ch)){
        //         ch=t.charAt(j);
        //     }
        // }
        // return ch;

        // int count = 0;

        // for(int i=0; i<t.length(); i++){
        //     count+=t.charAt(i);
        // }

        // for(int j=0; j<s.length(); j++){
        //     count-=s.charAt(j);
        // }
        // return (char)count;

        int count =0 ;
        for (char i : t.toCharArray() ) {
            count+= i;
        }
        for(int j: s.toCharArray()){
            count-=j;
        }
        return (char)count;
    }
    public static void main(String[] args) {
        char c = Fdiff("", "y");
        System.out.println(c);
    }
}
