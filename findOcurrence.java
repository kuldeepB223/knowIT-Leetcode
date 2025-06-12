public class findOcurrence {
    public static int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int neelen = needle.length();

        if(haylen == neelen){
            return 0;
        }
        else if(haylen < neelen ){
            return -1;
        }

        for(int i=0; i < haylen-neelen; i++){ // i<6

            int j=0;

            while(j<neelen && haystack.charAt(j+i)==needle.charAt(j)){ 
                j++;
            }

            if(j == neelen){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = strStr("s", "s");
        System.out.println(num);
    }
}
