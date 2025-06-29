
import java.util.Arrays;

public class Ques4{

    public static double findmedian(int[] a, int[] b){
        double median=0.0;
        int index=0;
        int alen=a.length; 
        int blen=b.length;
        int[] arr=new int[alen+blen];
        
        for (int i = 0; i < a.length; i++) {
            arr[index]=a[i];
            index++;
        }
        for(int j=0; j<b.length; j++){
            arr[index++]=b[j];
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            median=arr[(arr.length)/2];
        }else{
            median=arr[(arr.length/2)-1] + arr[((arr.length)/2)];
            median/=2; 
        }
        return median;
    }
    public static void main(String[] args) {
        int[] a={1, 2};
        int[] b={3, 4};
        System.out.println(findmedian(a, b));
    }
}