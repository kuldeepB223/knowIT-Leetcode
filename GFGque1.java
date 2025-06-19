import java.util.ArrayList;
import java.util.List;

public class GFGque1 {
    
    public static void main(String[] args) {
        int[]a = {1,2,2};
        int[]b = {1,1};
        
        

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            list.add(a[i]);
        }
        int cnt=0;
        for(int j=0; j<b.length; j++){
            if(list.contains(b[j])){
                cnt++;
            }
        }
        if(cnt!=b.length){
            System.out.println(false);
        }else{
            System.out.println( true);
        }
    }
}


