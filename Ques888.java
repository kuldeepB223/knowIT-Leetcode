public class Ques888 {
    public static void main(String[] args) {
        int[] aa={35,17,74,24,10};
        int[] bb={63,21};
        int[] arr=fairCandySwap(aa, bb);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("-----"+arr[i]);
        }
    }

//      Use static if you want to call the method without creating an object.
//      If not static, create an object and call the method on that object.

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // int[] arr=new int[2];
        // int sumA=0, sumB=0;
        // int lenA=0, lenB=0;

        // while(lenA!=aliceSizes.length-1 && lenB!=bobSizes.length-1){
            
        //     sumA=sumA+aliceSizes[lenA];
        //     sumB=sumB+bobSizes[lenB];
        //     lenA++;
        //     lenB++;
        // }
        // int num = (sumA-sumB)/2;

        // for (int i = 0; i < aliceSizes.length; i++) {
        //     for (int j = 0; j < bobSizes.length; j++) {
        //         if(aliceSizes[i]-bobSizes[j]==num){
        //             arr[0]=aliceSizes[i];
        //             arr[1]=bobSizes[j];
        //         }else{
        //             arr[0]=0;
        //             arr[1]=0;
        //         }
        //     }
        // }
        // return arr;

        int sumA = 0, sumB = 0;
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;
        int delta = (sumA - sumB) / 2;
        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (a - b == delta) {
                    return new int[]{a, b};
                }
            }
        }
        return new int[0];
    }
}

// do addition of all members of both array
// do subtraction of both addition
// chk if arr1[i]+arr2[j] == number 
//   then stored both number in a seperate array and return.

/*
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] arr=new int[2];
        int a=0, b=0;
        for(int i=0; i<aliceSizes.length; i++){
            if(a<aliceSizes[i]){
                a=aliceSizes[i];
            }
        }
        for(int j=0; j<bobSizes.length; j++){
            if(b<bobSizes[j]){
                b=bobSizes[j];
            }
        }
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
}*/