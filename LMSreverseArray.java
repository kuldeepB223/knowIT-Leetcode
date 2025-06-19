class LMSreverseArray{
    public static void main(String[] args) {
        int[] arr={8, -1, 10, 5, 7};
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int n = arr[l];
            arr[l] = arr[r];
            arr[r] = n;
            r--;
            l++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}