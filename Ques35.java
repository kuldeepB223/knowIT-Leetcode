public class Ques35 {
    public static void main(String[] args) {
        int[]nums={1,3,5,6}; int target=5;
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]){
                System.out.println("number is already present");
                break;
            }else if(target < nums[i]){
                System.err.println(target+" is at -> "+i);
            }else{
                System.out.println(target+" is at "+nums.length);
            }
        }
    }
}


//////////////////same code in javascript/////////////////////////////
/// 
// const nums = [1, 3, 5, 6];
// const target = 5;

// for (let i = 0; i < nums.length; i++) {
//     if (target === nums[i]) {
//         console.log("number is already present");
//         break;
//     } else if (target < nums[i]) {
//         console.error(`${target} is at -> ${i}`);
//         break;
//     } else if (i === nums.length - 1) {
//         console.log(`${target} is at ${nums.length}`);
//     }
// }
// //////////////////////////////////////////////////////////////
