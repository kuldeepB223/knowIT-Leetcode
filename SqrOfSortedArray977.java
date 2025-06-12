


public class SqrOfSortedArray977 {
    public static int[] sqrArr(int []arr){
        int[] sarr = new int[arr.length];
        for(int i=0, j=arr.length-1; i<j; i++, j--){
            sarr[i]=arr[i]*arr[i];
            sarr[j]=arr[j]*arr[j];
            if(sarr[i]>sarr[j]){
                sarr[i] += sarr[j];
                sarr[j] = sarr[i] - sarr[j];
                sarr[i] = sarr[i] - sarr[j];
            }
        }
        return sarr;
    }

    public static void main(String[] args) {
        int[] arr = {-7, -3, 2,3,11};
        int[] arr2 = sqrArr(arr);
        for(int i: arr2){

            System.out.println(i);
        }
    }
}
